import os
import time

import pyttsx3
import pycozmo

from PIL import Image
import numpy as np


def hablar(cli, text):
    
        # Initialize the Pyttsx3 engine
    audio = pyttsx3.init()
        #Set Rate. Defaults to 200 word per minute.
    audio.setProperty('rate', 150) 
        # We can use file extension as mp3 and wav, both will work
    audio.save_to_file(text, 'audio.wav')
        # Wait until above command is not finished.
    audio.runAndWait()

    # Set volume to maximum.
    cli.set_volume(65535)

    # A 22 kHz, 16-bit, mono file is required.
    cli.play_audio("audio.wav")
    
    cli.wait_for(pycozmo.event.EvtAudioCompleted)


'''
1. Arriba
2. Medio Alto
3. Medio
4. Medio Bajo
5. Bajo
'''
def moverBrazos (cli, origen, destino, n_veces):    
    trayecto = [origen, destino]
    cli.wait_for_robot() # se puede sustituir por la siguiente linea??????????
    #Necesita esperar unos segundos para realizar los primeros movimientos
    #time.sleep(5) 
    for i in range(n_veces):
        for mov in trayecto:
            if mov == 1:
                cli.set_lift_height(pycozmo.MAX_LIFT_HEIGHT.mm) #92mm
                time.sleep(0.5)
            elif mov == 2:
                cli.set_lift_height(75.00) #75mm
                time.sleep(0.5)
            elif mov == 3:
                cli.set_lift_height(pycozmo.MIN_LIFT_HEIGHT.mm*2) #64mm
                time.sleep(0.5)
            elif mov == 4:
                cli.set_lift_height(pycozmo.LIFT_PIVOT_HEIGHT.mm) #45mm
                time.sleep(0.5)
            elif mov == 5:
                cli.set_lift_height(pycozmo.MIN_LIFT_HEIGHT.mm) #32mm
                time.sleep(0.5)
    time.sleep(2)


'''
1. Rápido
2. Medio
3. Lento
4. Marcha atrás
'''
def moverRuedas(cli, n_velocidad, tiempo, girar):
    # Establecer velocidad
    if n_velocidad == 1:
        velocidad = 100.00
        
    elif n_velocidad == 2:
        velocidad = 50.00

    elif n_velocidad == 3:
        velocidad = 30.00

    elif n_velocidad == 4:
        velocidad = -50.00

    #Establecer si ambas ruedas van en la misma dirección o no
    if girar:
        Rvelocidad = 0 - velocidad
    else:
        Rvelocidad = velocidad

    cli.drive_wheels(lwheel_speed=velocidad, rwheel_speed=Rvelocidad, duration=tiempo)


'''
1. Arriba
2. Medio
3. Bajo
'''
def moverCabeza (cli, origen, destino, n_veces):
    trayecto = [origen, destino]
    cli.wait_for_robot()
    
    for i in range(n_veces):

        for mov in trayecto:
            if mov == 1:
                cli.set_head_angle(pycozmo.MAX_HEAD_ANGLE.radians) #44,5º
                time.sleep(1)
            elif mov == 2:
                cli.set_head_angle(pycozmo.MAX_HEAD_ANGLE.radians/2) #22º
                time.sleep(1)
            elif mov == 3:
                cli.set_head_angle(pycozmo.MIN_HEAD_ANGLE.radians) #-25º
                time.sleep(1)


'''
0. Neutral
1. Anger
2. Sadness
3. Happiness
4. Surprise
5. Disgust
6. Fear
7. Pleading
8. Vulnerability
9. Despair
10. Guilt
11. Disappointment
12. Embarrassment
13. Horror
14. Skepticism
15. Annoyance
16. Fury
17. Suspicion
18. Rejection
19. Boredom
20. Tiredness
21. Asleep
22. Confusion
23. Amazement
24. Excitement
'''
def mostrarSentimiento(cli, n_sentimiento):
    
    cli.enable_procedural_face(False)

    # List of face expressions.
    expressions = [
        pycozmo.expressions.Neutral(),
        pycozmo.expressions.Anger(),
        pycozmo.expressions.Sadness(),
        pycozmo.expressions.Happiness(),
        pycozmo.expressions.Surprise(),
        pycozmo.expressions.Disgust(),
        pycozmo.expressions.Fear(),
        pycozmo.expressions.Pleading(),
        pycozmo.expressions.Vulnerability(),
        pycozmo.expressions.Despair(),
        pycozmo.expressions.Guilt(),
        pycozmo.expressions.Disappointment(),
        pycozmo.expressions.Embarrassment(),
        pycozmo.expressions.Horror(),
        pycozmo.expressions.Skepticism(),
        pycozmo.expressions.Annoyance(),
        pycozmo.expressions.Fury(),
        pycozmo.expressions.Suspicion(),
        pycozmo.expressions.Rejection(),
        pycozmo.expressions.Boredom(),
        pycozmo.expressions.Tiredness(),
        pycozmo.expressions.Asleep(),
        pycozmo.expressions.Confusion(),
        pycozmo.expressions.Amazement(),
        pycozmo.expressions.Excitement(),
    ]

    # Base face expression. FALLA AQUIIII
    base_face = pycozmo.expressions.Neutral()

    rate = pycozmo.robot.FRAME_RATE
    timer = pycozmo.util.FPSTimer(rate)

    # Transition from base face to expression and back.
    for from_face, to_face in ((base_face, expressions[n_sentimiento]), (expressions[n_sentimiento], base_face)):

        if to_face != base_face:
            print(to_face.__class__.__name__)

        # Generate transition frames.
        face_generator = pycozmo.procedural_face.interpolate(from_face, to_face, rate // 3)
        for face in face_generator:

            # Render face image.
            im = face.render()

            # The Cozmo protocol expects a 128x32 image, so take only the even lines.
            np_im = np.array(im)
            np_im2 = np_im[::2]
            im2 = Image.fromarray(np_im2)

            # Display face image.
            cli.display_image(im2)

            # Maintain frame rate.
            timer.sleep()

        # Pause for 1s.
        for i in range(rate):
            timer.sleep()
        
    cli.enable_procedural_face(True)


def on_camera_image(cli, image):
    image.save("TareasGenericas/Recursos/camera.png", "PNG")

def hacerFoto(cli):
    cli.enable_camera(enable=True, color=True)

    # Wait for image to stabilize.
    time.sleep(2.0)

    cli.add_handler(pycozmo.event.EvtNewRawCameraImage, on_camera_image, one_shot=True)

    # Wait for image to be captured.
    time.sleep(1)
    hablar(cli, "Ya he hecho la foto")


def mostrarImagen (cli, imagen):
    
    cli.enable_procedural_face(False)
    # Load image
    im = Image.open(os.path.join(os.path.dirname(__file__), "Recursos", imagen))
    
    # Resize from 320x240 to 68x17. Larger image sometime are too big for the robot receive buffer.
    im = im.resize((128, 32)) # Convert to binary image.

    im = im.convert('1')

    cli.display_image(im, 3)
    cli.enable_procedural_face(True)


'''
0. Red
1. Green
2. Blue
3. White
4. Off
'''
def cambiarColorLuz(cli, n_luz):
    lights = [
        pycozmo.lights.red_light,
        pycozmo.lights.green_light,
        pycozmo.lights.blue_light,
        pycozmo.lights.white_light,
        pycozmo.lights.off_light,
    ]
    
    cli.set_all_backpack_lights(lights[n_luz])
    time.sleep(0.5)


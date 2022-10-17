
import pycozmo
import time

import TareasGenericas as mycozmo
from Saludar import *

import tkinter as tk

def queHacemos(cli, n_veces_SubirBrazos_Saludar = 3

, n_luz_ColorAzul = 2

, n_luz_ColorRojo = 0

, origen_SubirBrazos = 5
, destino_SubirBrazos = 3
, n_veces_SubirBrazos = 1


, text_Ambulancia = "Soy una ambulancia, nino, nino."

, n_velocidad_GirarAlante = 1
, tiempo_GirarAlante = 2
, girar_GirarAlante = True

, n_velocidad_GirarAtras = 4
, tiempo_GirarAtras = 3
, girar_GirarAtras = True

):
    '''-------------Saludar - SALUDAR-------------'''
    saludar(cli, n_veces_SubirBrazos=n_veces_SubirBrazos_Saludar)
    
    '''------------------------Que hacemos? - QUESTION------------------------------'''
    text_label = "Que hacemos?"

    ventanaQ=tk.Tk()
    #set center screen window with following coordination
    MyLeftPos = (ventanaQ.winfo_screenwidth() - 400) / 2
    myTopPos = (ventanaQ.winfo_screenheight() - 400) / 2
    ventanaQ.geometry( "%dx%d+%d+%d" % (400, 400, MyLeftPos, myTopPos))

    ventanaQ.title("Interfaz Cozmo") 

    lbl = tk.Label(ventanaQ, text=text_label, font=("Arial Bold", 14))
    lbl.pack(pady=15)

    answer1 = "Jugar"
    boton1=tk.Button(ventanaQ, text=answer1, bg="#82c9dd", width = 9, font = ("Bold"),
            command=lambda: action1(ventanaQ, text_Ambulancia, n_luz_ColorAzul, n_luz_ColorRojo))
    boton1.pack(pady=10)
    answer2 = "Bailar"
    boton2=tk.Button(ventanaQ, text=answer2, bg="#82c9dd", width = 9, font = ("Bold"),
            command=lambda: action2(ventanaQ, origen_SubirBrazos, destino_SubirBrazos, n_veces_SubirBrazos, n_velocidad_GirarAlante, tiempo_GirarAlante, girar_GirarAlante, n_velocidad_GirarAtras, tiempo_GirarAtras, girar_GirarAtras))
    boton2.pack(pady=10)
    answer3 = "Foto"
    boton3=tk.Button(ventanaQ, text=answer3, bg="#82c9dd", width = 9, font = ("Bold"),
            command=lambda: action3(ventanaQ))
    boton3.pack(pady=10)
    ventanaQ.mainloop()

def action1(ventanaQ, text_Ambulancia, n_luz_ColorAzul, n_luz_ColorRojo):
    '''-------------Ambulancia - HABLAR-------------'''
    mycozmo.hablar(cli, text_Ambulancia)
    
    '''------------------------Ambulancia - COUNTER_BASED------------------------------'''
    
    
    for i in range(6):
        '''-------------ColorAzul - CAMBIARCOLORLUZ-------------'''
        mycozmo.cambiarColorLuz(cli, n_luz_ColorAzul)
        
        '''-------------ColorRojo - CAMBIARCOLORLUZ-------------'''
        mycozmo.cambiarColorLuz(cli, n_luz_ColorRojo)
        
    



    ventanaQ.quit()

def action2(ventanaQ, origen_SubirBrazos, destino_SubirBrazos, n_veces_SubirBrazos, n_velocidad_GirarAlante, tiempo_GirarAlante, girar_GirarAlante, n_velocidad_GirarAtras, tiempo_GirarAtras, girar_GirarAtras):
    '''-------------SubirBrazos - MOVERBRAZOS-------------'''
    mycozmo.moverBrazos(cli, origen_SubirBrazos, destino_SubirBrazos, n_veces_SubirBrazos)
    
    '''------------------------Gira - COUNTER_BASED------------------------------'''
    
    
    for i in range(3):
        '''-------------GirarAlante - MOVERRUEDAS-------------'''
        mycozmo.moverRuedas(cli, n_velocidad_GirarAlante, tiempo_GirarAlante, girar_GirarAlante)
        
        '''-------------GirarAtras - MOVERRUEDAS-------------'''
        mycozmo.moverRuedas(cli, n_velocidad_GirarAtras, tiempo_GirarAtras, girar_GirarAtras)
        
    



    ventanaQ.quit()

def action3(ventanaQ):
    '''-------------HacerFoto - HACERFOTO-------------'''
    mycozmo.hacerFoto(cli)
    


    ventanaQ.quit()




'''-----------------------------        MAIN         ------------------------------'''
if __name__ == '__main__':
    '''-----------------------------Comenzar conexion------------------------------'''
    cli = pycozmo.Client()
    cli.start()
    cli.connect()
    cli.wait_for_robot()

    '''------------------------------Levantar cabeza-------------------------------'''
    angle = (pycozmo.robot.MAX_HEAD_ANGLE.radians - pycozmo.robot.MIN_HEAD_ANGLE.radians) / 2.0
    cli.set_head_angle(angle)

    '''--------------------------Llamada a metodo inicial---------------------------'''
    queHacemos(cli) 

    '''-----------------------------Finalizar conexion------------------------------'''
    cli.set_head_angle(pycozmo.robot.MIN_HEAD_ANGLE.radians)
    time.sleep(1)

    cli.disconnect()
    cli.stop()

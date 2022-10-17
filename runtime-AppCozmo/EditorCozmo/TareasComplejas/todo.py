
import pycozmo
import time

import TareasGenericas as mycozmo

import tkinter as tk

def todo(cli, text_Saludar = "Hola"

, n_luz_LuzAzul = 3

, n_sentimiento_Contento = 3

, imagen_ImagenHelloWord = "hello_world"


, origen_SubirBrazos = 5
, destino_SubirBrazos = 1
, n_veces_SubirBrazos = 2

, origen_SubirCabeza = 1
, destino_SubirCabeza = 3
, n_veces_SubirCabeza = 4

, n_velocidad_Andar = 3
, tiempo_Andar = 4
, girar_Andar = False

):
    '''-------------Saludar - HABLAR-------------'''
    mycozmo.hablar(cli, text_Saludar)
    
    '''-------------HacerFoto - HACERFOTO-------------'''
    mycozmo.hacerFoto(cli)
    
    '''-------------ImagenHelloWord - MOSTRARIMAGEN-------------'''
    mycozmo.mostrarImagen(cli, imagen_ImagenHelloWord)
    
    '''-------------Contento - MOSTRARSENTIMIENTO-------------'''
    mycozmo.mostrarSentimiento(cli, n_sentimiento_Contento)
    
    '''-------------LuzAzul - CAMBIARCOLORLUZ-------------'''
    mycozmo.cambiarColorLuz(cli, n_luz_LuzAzul)
    
    '''-------------SubirCabeza - MOVERCABEZA-------------'''
    mycozmo.moverCabeza(cli, origen_SubirCabeza, destino_SubirCabeza, n_veces_SubirCabeza)
    
    '''-------------Andar - MOVERRUEDAS-------------'''
    mycozmo.moverRuedas(cli, n_velocidad_Andar, tiempo_Andar, girar_Andar)
    
    '''-------------SubirBrazos - MOVERBRAZOS-------------'''
    mycozmo.moverBrazos(cli, origen_SubirBrazos, destino_SubirBrazos, n_veces_SubirBrazos)
    









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
    todo(cli) 

    '''-----------------------------Finalizar conexion------------------------------'''
    cli.set_head_angle(pycozmo.robot.MIN_HEAD_ANGLE.radians)
    time.sleep(1)

    cli.disconnect()
    cli.stop()

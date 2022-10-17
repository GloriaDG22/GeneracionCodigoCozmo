
import pycozmo
import time

import TareasGenericas as mycozmo
from Saludar import *

import tkinter as tk

def saludarYAndar(cli, n_sentimiento_Contento = 3

, n_velocidad_Andar = 2
, tiempo_Andar = 2
, girar_Andar = True

, n_veces_SubirBrazos_Saludar = 4

):
    '''-------------Saludar - SALUDAR-------------'''
    saludar(cli, n_veces_SubirBrazos=n_veces_SubirBrazos_Saludar)
    
    '''-------------Contento - MOSTRARSENTIMIENTO-------------'''
    mycozmo.mostrarSentimiento(cli, n_sentimiento_Contento)
    
    '''-------------Andar - MOVERRUEDAS-------------'''
    mycozmo.moverRuedas(cli, n_velocidad_Andar, tiempo_Andar, girar_Andar)
    




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
    saludarYAndar(cli) 

    '''-----------------------------Finalizar conexion------------------------------'''
    cli.set_head_angle(pycozmo.robot.MIN_HEAD_ANGLE.radians)
    time.sleep(1)

    cli.disconnect()
    cli.stop()

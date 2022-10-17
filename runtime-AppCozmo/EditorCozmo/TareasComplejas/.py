
import pycozmo
import time

import TareasGenericas as mycozmo
from Saludar import *

import tkinter as tk

def invalid(cli, text_Presentarse_Saludar = "Hola Alma, soy Cozmo"

, text_Despedirse = "Adiós amiga."

):
    '''-------------Saludar - SALUDAR-------------'''
    saludar(cli, text_Presentarse=text_Presentarse_Saludar)
    
    '''-------------Despedirse - HABLAR-------------'''
    mycozmo.hablar(cli, text_Despedirse)
    



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
    invalid(cli) 

    '''-----------------------------Finalizar conexion------------------------------'''
    cli.set_head_angle(pycozmo.robot.MIN_HEAD_ANGLE.radians)
    time.sleep(1)

    cli.disconnect()
    cli.stop()

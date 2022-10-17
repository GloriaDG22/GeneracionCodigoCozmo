
import pycozmo
import time

import TareasGenericas as mycozmo

import tkinter as tk

def saludar(cli, text_Presentarse = "Hola Gloria, yo soy Cozmo"

, origen_SubirBrazos = 5
, destino_SubirBrazos = 1
, n_veces_SubirBrazos = 2

, text_Despedirse = "Adiós amiga."

):
    '''-------------Presentarse - HABLAR-------------'''
    mycozmo.hablar(cli, text_Presentarse)
    
    '''-------------SubirBrazos - MOVERBRAZOS-------------'''
    mycozmo.moverBrazos(cli, origen_SubirBrazos, destino_SubirBrazos,
                         n_veces_SubirBrazos)
    
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
    saludar(cli) 

    '''-----------------------------Finalizar conexion------------------------------'''
    cli.set_head_angle(pycozmo.robot.MIN_HEAD_ANGLE.radians)
    time.sleep(1)

    cli.disconnect()
    cli.stop()

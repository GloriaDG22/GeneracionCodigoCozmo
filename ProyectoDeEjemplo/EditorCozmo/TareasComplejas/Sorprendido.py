
import pycozmo
import time

import TareasGenericas as mycozmo

import tkinter as tk

def sorprendido(cli, n_sentimiento_Sorprendido = 4

):
    '''-------------Sorprendido - MOSTRARSENTIMIENTO-------------'''
    mycozmo.mostrarSentimiento(cli, n_sentimiento_Sorprendido)
    


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
    sorprendido(cli) 

    '''-----------------------------Finalizar conexion------------------------------'''
    cli.set_head_angle(pycozmo.robot.MIN_HEAD_ANGLE.radians)
    time.sleep(1)

    cli.disconnect()
    cli.stop()

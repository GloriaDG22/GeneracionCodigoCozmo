
import pycozmo
import time

import TareasGenericas as mycozmo
from Saludar import *

import tkinter as tk

def ejemplo(cli, text_Presentarse_Saludar = "Hola Alma, soy Cozmo"

, text_Despedirse = "Adiós amiga."

, origen_SubirBrazos = 5
, destino_SubirBrazos = 1
, n_veces_SubirBrazos = 3

):
    '''-------------Saludar - SALUDAR-------------'''
    saludar(cli, text_Presentarse=text_Presentarse_Saludar)
    
    '''------------------------Jugamos? - QUESTION------------------------------'''
    text_label = "Jugamos?"

    ventanaQ=tk.Tk()
    #set center screen window with following coordination
    MyLeftPos = (ventanaQ.winfo_screenwidth() - 400) / 2
    myTopPos = (ventanaQ.winfo_screenheight() - 400) / 2
    ventanaQ.geometry( "%dx%d+%d+%d" % (400, 400, MyLeftPos, myTopPos))

    ventanaQ.title("Interfaz Cozmo") 

    lbl = tk.Label(ventanaQ, text=text_label, font=("Arial Bold", 14))
    lbl.pack(pady=15)

    answer1 = "Sí"
    boton1=tk.Button(ventanaQ, text=answer1, bg="#82c9dd", width = 9, font = ("Bold"),
            command=lambda: action1(ventanaQ, origen_SubirBrazos, destino_SubirBrazos, n_veces_SubirBrazos))
    boton1.pack(pady=10)
    answer2 = "No"
    boton2=tk.Button(ventanaQ, text=answer2, bg="#82c9dd", width = 9, font = ("Bold"),
            command=lambda: action2(ventanaQ, text_Despedirse))
    boton2.pack(pady=10)
    ventanaQ.mainloop()

def action1(ventanaQ, origen_SubirBrazos, destino_SubirBrazos, n_veces_SubirBrazos):
    '''------------------------Jugar - DO_WHILE------------------------------'''
    
    '''-------------SubirBrazos - MOVERBRAZOS-------------'''
    mycozmo.moverBrazos(cli, origen_SubirBrazos, destino_SubirBrazos, n_veces_SubirBrazos)
    
    text_label="Repetimos Jugar?"
    
    ventana=tk.Tk()
    #set center screen window with following coordination
    MyLeftPos = (ventana.winfo_screenwidth() - 400) / 2
    myTopPos = (ventana.winfo_screenheight() - 200) / 2
    ventana.geometry( "%dx%d+%d+%d" % (400, 200, MyLeftPos, myTopPos))
    
    ventana.title("Interfaz Cozmo") 
    
    lbl = tk.Label(ventana, text=text_label, font=("Arial Bold", 14))
    lbl.pack(pady=15)
    
    boton1=tk.Button(ventana, text="SI", bg="#6ce238", width = 9, font = ("Bold"),
                command=lambda: doJugar(origen_SubirBrazos, destino_SubirBrazos, n_veces_SubirBrazos))
    boton1.pack(side=tk.LEFT, padx=45, pady=20)
    boton2=tk.Button(ventana, text="NO", bg="#ff5649", width = 9, font = ("Bold"),
                command=ventana.quit)
    boton2.pack(side=tk.RIGHT, padx=45, pady=20)
    ventana.mainloop()
    


    ventanaQ.quit()

def action2(ventanaQ, text_Despedirse):
    '''-------------Despedirse - HABLAR-------------'''
    mycozmo.hablar(cli, text_Despedirse)
    


    ventanaQ.quit()




def doJugar(origen_SubirBrazos, destino_SubirBrazos, n_veces_SubirBrazos):							
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
    ejemplo(cli) 

    '''-----------------------------Finalizar conexion------------------------------'''
    cli.set_head_angle(pycozmo.robot.MIN_HEAD_ANGLE.radians)
    time.sleep(1)

    cli.disconnect()
    cli.stop()

import time
import matplotlib.pyplot as plt
tempo = []
vez = [1,2,3,4,5]
x=int(0)
while x < 5:
    inicio = time.clock()
    input('DIGITE SEU NOME:')
    fim = time.clock()
    tempo.append(fim-inicio)
    x+=1

legenda = ['1ºvez','2ºvez','3ºvez','4ºvez','5ºvez']
plt.plot(vez,tempo)
plt.xticks(vez,legenda)
plt.show()






    
    

import datetime as d
t = d.time(4,20,1)
print(t.hour)
print(t.minute)
print(t.second)

hoje = d.datetime.today()
print(hoje)
print(hoje.ctime())

d1 = d.date(2023 , 6, 17)
d2 = d.date(2023, 9, 20)

print((d2-d1).days)
print(d1.strftime('%d/%m/%Y'))





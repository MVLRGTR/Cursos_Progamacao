from geopy.geocoders import Nominatim

def latitude_longitude(endereco):
    geolocalizador = Nominatim(user_agent="my_geocoder")
    localizacao=geolocalizador.geocode(endereco)
    print(localizacao)


latitude_longitude('Rua Dionísio Pedro de Alcântara')
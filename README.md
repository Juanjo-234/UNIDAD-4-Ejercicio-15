Resolución del ejercicio N°15 de la unidad 4 de programación 2.
El programa simula un sistema de pruebas de rendimiento para vehículos de carrera aplicando los principios de la Programación Orientada a Objetos (POO). Su propósito principal es demostrar el uso de clases abstractas, herencia y polimorfismo para gestionar de manera unificada diferentes tipos de vehículos (monoplazas de Fórmula 1, autos de rally y motocicletas), cada uno con sus propias tasas de aceleración y mecánicas de consumo de combustible, procesándolos de forma genérica a través de un método coordinador.

Clases y Componentes Utilizados
VehiculoCarrera (Clase Abstracta)

Propósito: Actúa como la plantilla base para cualquier vehículo de competición. Define atributos comunes como velocidadActual y combustible, y declara los métodos abstractos acelerar(int segundos) y obtenerDesempeno(), obligando a las clases hijas a definir su propio comportamiento de aceleración y rendimiento.

MonoplazaF1 (Clase Concreta / Hija)

Propósito: Modela un vehículo de Fórmula 1. Implementa los métodos abstractos aplicando una tasa de aceleración muy alta y un consumo de combustible rápido adaptado a la máxima competición en pista asfaltada.

AutoRally (Clase Concreta / Hija)

Propósito: Modela un auto de rally. Sobrescribe los métodos considerando una aceleración progresiva y mayor resistencia en terrenos difíciles, calculando su desempeño bajo condiciones de tracción variable.

Motocicleta (Clase Concreta / Hija)

Propósito: Modela una motocicleta de carreras. Implementa su propia regla de aceleración basada en una relación peso-potencia elevada y un cálculo de rendimiento específico para dos ruedas.

Método Coordinador / Gestor (Función Coordinadora)

Propósito: Recibe una colección o lista heterogénea de vehículos (tipados como VehiculoCarrera) y se encarga de recorrerla de manera polimórfica, disparando las pruebas de aceleración y mostrando los resultados de rendimiento sin necesidad de conocer la clase exacta de cada vehículo.
<img width="810" height="483" alt="Captura de pantalla 2026-10-29 153032" src="https://github.com/user-attachments/assets/98d7d77f-951e-4636-ad7e-f69949df0fbc" />

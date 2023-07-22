package edu.ejercicios.ejercicios;

public class clsEjercicios {
    //1. Área de un círculo: A = πr², donde r es el radio del círculo.
    public void areaCirculo(double radio){
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);
    }

    //2. Circunferencia de un círculo: C = 2πr, donde r es el radio del círculo.
    public void circunferencia(double radio){
        double circunferencia = 2 * Math.PI * radio;
        System.out.println("La circunferencia del círculo es: " + circunferencia);
    }

    //3. Volumen de un cubo: V = s³, donde s es la longitud de cada lado del cubo.
    public void volumen(double s){
        double volumen = Math.pow(s, 3);
        System.out.println("El volumen del cubo es: " + volumen);
    }

    //4. Área de una pirámide cuadrada: A = (base × altura) / 2, donde base es la longitud de la base de la pirámide y altura es la altura de la pirámide.
    public void areaPiramide(double base, double altura){
        double area = (base * altura) / 2;
        System.out.println("El área de la pirámide es: " + area);
    }

    //5. Volumen de una pirámide cuadrada: V = (base × altura) / 3, donde base es la longitud de la base de la pirámide y altura es la altura de la pirámide.
    public void volumenPiramide(double base, double altura){
        double volumen = (base * altura) / 3;
        System.out.println("El volumen de la pirámide es: " + volumen);
    }

    //6. Área de un triángulo: A = (base × altura) / 2, donde base es la longitud de la base del triángulo y altura es la altura del triángulo.
    public void areaTriangulo(double base, double altura){
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }

    //7. Volumen de un prisma rectangular: V = area_base × altura, donde area_base es el área de la base del prisma y altura es la altura del prisma.
    public void volumenPrisma(double area_base, double altura){
        double volumen = area_base * altura;
        System.out.println("El volumen del prisma es: " + volumen);
    }

    //8. Área de un paralelogramo: A = base × altura, donde base es la longitud de la base del paralelogramo y altura es la altura del paralelogramo.
    public void areaParalelogramo(double base, double altura){
        double area = base * altura;
        System.out.println("El área del paralelogramo es: " + area);
    }

    //9. Volumen de un cilindro: V = πr²h, donde r es el radio de la base circular del cilindro y h es la altura del cilindro.
    public void volumenCilindro(double radio, double altura){
        double volumen = Math.PI * Math.pow(radio, 2) * altura;
        System.out.println("El volumen del cilindro es: " + volumen);
    }

    //10. Área de una esfera: A = 4πr², donde r es el radio de la esfera.
    public void areaEsfera(double radio){
        double area = 4 * Math.PI * Math.pow(radio, 2);
        System.out.println("El área de la esfera es: " + area);
    }
}

fun main(args: Array<String>) {
    var diametro = 0
    var area = 0.00
    var perimetro = 0.00
    var pi = 3.14
    var raio = 0.00
    var leitura = Scanner(System.`in`)

    print("Digite o valor do diâmetro da circunferência: ")
    diametro = leitura.nextInt()

    perimetro = diametro * pi

    raio = diametro.toDouble() / 2
    area = pi * raio * raio

    print("O perímetro da circunferência do círculo é: $perimetro e a área é $area")
}
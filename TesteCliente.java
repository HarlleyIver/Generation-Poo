package Poo;

import java.time.LocalDate;

public class TesteCliente {
    public static void main(String[] args) {

        PessoaFisica c1 = new PessoaFisica("Gabriel Barbosa",
                LocalDate.of(1981, 12, 13),
                "(11) 975114911",
                "gabigol10@gmail.com", 
                "97531817021");

        PessoaJuridica c2 = new PessoaJuridica("Rodinei silva",
                LocalDate.of(1990, 10, 15),
                "(11) 980299249",
                "rodineifla@gmailcom",
                "000009888888818");

        c1.visualizar();
        System.out.println("========================================");
        c2.visualizar();
        System.out.println("========================================");

       
    }
}

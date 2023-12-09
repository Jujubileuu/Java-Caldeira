package Aula07.Exercicio02;

import java.util.*;

public enum DiaDaSemana {
    DOMINGO("Segundo a astrologia, as pessoas nascidas ao domingo são sortudas. A estrela governante é o Sol, o que geralmente significa que serão brilhantes, criativas, e líderes naturais."),
    SEGUNDA("A segunda-feira é comandada pela Lua, que de acordo com a astrologia é uma entidade materna dedicada à bondade e à família. Quem nasce neste dia é bondoso e gentil."),
    TERCA("Marte (ou Ares) é o Deus da guerra, que rege este dia, e assim. As pessoas nascidas às terças têm um espírito lutador, são corajosas, impacientes, bem sucedidas e ativas."),
    QUARTA("Data regida por Mercúrio, deus da comunicação, das viagens e das finanças. Quem nasceu numa quarta-feira é comunicativo e versátil, mas também é melancólico e trapalhão."),
    QUINTA("As quintas-feiras são regidas pelo deus nórdico Thor (sim, aquele dos filmes da Marvel). Estes indivíduos são alegres, felizes e otimistas."),
    SEXTA("Sociáveis, artísticos e um pouco narcisistas – é assim quem nasce com um pé no fim-de-semana. A sexta-feira é dominada pelo planeta Vénus, que está associado ao amor, à beleza e ao equilíbrio."),
    SABADO("As crianças nascidas neste dia são regidas por Saturno, o deus da riqueza, da liberdade e da agricultura. Porém na verdade e segundo a astrologia, são modestos, estudiosos, sábios, práticos e rigorosos.");

    public final String mensagem;

    DiaDaSemana(String mensagem) {
        this.mensagem = mensagem;
    }
}

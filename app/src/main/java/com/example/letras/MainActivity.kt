package com.example.letras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buscarMusica()

        val botaoMusicaTraducao = findViewById<Button>(R.id.buttonLetraTraducao)
        botaoMusicaTraducao.setOnClickListener {
            buscarMusicaTraducao()
        }

        val botaoMusicaOriginal = findViewById<Button>(R.id.buttonLetraOriginal)
        botaoMusicaOriginal.setOnClickListener {
            buscarMusica()
        }

    }

    fun buscarMusica(){
        val textViewTituloMusica = findViewById<TextView>(R.id.musica)
        textViewTituloMusica.text = TITULO_MUSICA

        val textViewArtista = findViewById<TextView>(R.id.artista)
        textViewArtista.text = ARTISTA

        val textViewMusica = findViewById<TextView>(R.id.letraMusica)
        textViewMusica.text = MUSICA_ORIGINAL

    }
    fun buscarMusicaTraducao(){
        val textViewTituloMusica = findViewById<TextView>(R.id.musica)
        textViewTituloMusica.text = TITULO_MUSICA_TRADUCAO

        val textViewArtista = findViewById<TextView>(R.id.artista)
        textViewArtista.text = ARTISTA

        val textViewMusica = findViewById<TextView>(R.id.letraMusica)
        textViewMusica.text = MUSICA_TRADUCAO

    }
    companion object {
        val ARTISTA = "Miley Cyrus"
        val TITULO_MUSICA = "Plastic Hearts"
        val TITULO_MUSICA_TRADUCAO = "Corações de Plástico"
        val MUSICA_TRADUCAO = "Olá\n" +
                "Um lugar ensolarado para pessoas sombrias\n" +
                "Uma sala lotada onde ninguém vai\n" +
                "Você pode ser quem você quiser aqui\n" +
                "\n" +
                "E oh, eu tenho morado no Château\n" +
                "Não deveria dirigir, mas eu realmente devia ir para casa\n" +
                "Eu nem os conheço, mas eles não vão sair daqui\n" +
                "\n" +
                "Assustada com meu próprio reflexo\n" +
                "Desesperada por uma nova conexão\n" +
                "Te puxo para perto, mas não se aproxime demais\n" +
                "Eu te amo agora, mas não amanhã\n" +
                "É errado roubar, mas não pegar emprestado\n" +
                "Te puxo para perto, mas não se aproxime demais\n" +
                "\n" +
                "Tenho tido sonhos californianos\n" +
                "Corações de plástico estão sangrando\n" +
                "Me mantenha acordada a noite toda (me mantenha acordada)\n" +
                "Me mantenha acordada a noite toda (a noite toda)\n" +
                "Perdida em conversas de buracos negros\n" +
                "Sufocamento ao nascer do Sol\n" +
                "Me mantenha acordada a noite toda (me mantenha acordada)\n" +
                "Me mantenha acordada a noite toda\n" +
                "\n" +
                "Eu só quero sentir (sentir)\n" +
                "Eu só quero sentir algo (sentir algo agora)\n" +
                "Mas continuo não sentindo nada a noite toda\n" +
                "A noite toda\n" +
                "A noite toda\n" +
                "A noite toda\n" +
                "\n" +
                "Olá (olá)\n" +
                "Vou te contar todas as pessoas que conheço (eu conheço)\n" +
                "Te vendo algo que você já possui (você possui)\n" +
                "Eu posso ser quem você quiser que eu seja\n" +
                "\n" +
                "Me ame agora, mas não amanhã\n" +
                "Me preencha, mas me deixe vazia\n" +
                "Me puxe para perto, mas não se aproxime demais (oh)\n" +
                "\n" +
                "Tenho tido sonhos californianos\n" +
                "Corações de plástico estão sangrando\n" +
                "Me mantenha acordada a noite toda (me mantenha acordada)\n" +
                "Me mantenha acordada a noite toda (a noite toda)\n" +
                "Perdida em conversas de buracos negros\n" +
                "Sufocamento ao nascer do Sol\n" +
                "Me mantenha acordada a noite toda (me mantenha acordada)\n" +
                "Me mantenha acordada a noite toda\n" +
                "\n" +
                "Eu só quero sentir (sentir)\n" +
                "Eu só quero sentir algo (sentir algo agora)\n" +
                "Mas continuo não sentindo nada a noite toda\n" +
                "\n" +
                "A noite toda\n" +
                "A noite toda\n" +
                "A noite toda\n" +
                "A noite toda\n" +
                "\n" +
                "Tenho tido sonhos californianos (sonhos)\n" +
                "Corações de plástico estão sangrando (estão sangrando)\n" +
                "Me mantenha acordada a noite toda, sim (me mantenha acordada)\n" +
                "Me mantenha acordada a noite toda (a noite toda)\n" +
                "Perdida em conversas de buracos negros\n" +
                "Sufocamento ao nascer do Sol (sufocamento)\n" +
                "Me mantenha acordada a noite toda (me mantenha acordada, oh, sim)\n" +
                "Me mantenha acordada a noite toda\n" +
                "\n" +
                "Eu só quero sentir (sentir)\n" +
                "Eu só quero sentir algo (sentir algo agora)\n" +
                "Mas continuo não sentindo nada a noite toda"
        val MUSICA_ORIGINAL = "Hello\n" +
                "The sunny place for shady people\n" +
                "A crowded room where nobody goes\n" +
                "You can be whoever you wanna be here\n" +
                "\n" +
                "And oh, I've been livin' at the Chateau\n" +
                "Shouldn't drive, but I should really go home\n" +
                "I don't even know 'em, but they won't leave here\n" +
                "\n" +
                "Frightened by my own reflection\n" +
                "Desperate for a new connection\n" +
                "Pull you in, but don't you get too close\n" +
                "Love you now, but not tomorrow\n" +
                "Wrong to steal, but not to borrow\n" +
                "Pull you in, but don't you get too close\n" +
                "\n" +
                "I've been California dreamin'\n" +
                "Plastic hearts are bleedin'\n" +
                "Keep me up all night (keep me up)\n" +
                "Keep me up all night (all night)\n" +
                "Lost in black hole conversation\n" +
                "Sunrise suffocation\n" +
                "Keep me up all night (keep me up)\n" +
                "Keep me up all night\n" +
                "\n" +
                "I just wanna feel (feel)\n" +
                "I just wanna feel somethin' (feel somethin' now)\n" +
                "But I keep feeling nothin' all night long\n" +
                "All night long\n" +
                "All night long\n" +
                "All night long\n" +
                "\n" +
                "Hello (hello)\n" +
                "I'll tell you all the people I know (I know)\n" +
                "Sell you somethin' that you already own (you own)\n" +
                "I can be whoever you want me to be\n" +
                "\n" +
                "Love me now, but not tomorrow\n" +
                "Fill me up, but leave me hollow\n" +
                "Pull me in, but don't you get too close (oh)\n" +
                "\n" +
                "I've been California dreamin'\n" +
                "Plastic hearts are bleedin'\n" +
                "Keep me up all night (keep me up)\n" +
                "Keep me up all night (all night)\n" +
                "Lost in black hole conversations\n" +
                "Sunrise suffocation\n" +
                "Keep me up all night (keep me up)\n" +
                "Keep me up all night\n" +
                "\n" +
                "I just wanna feel (feel)\n" +
                "I just wanna feel somethin' (feel somethin' now)\n" +
                "But I keep feelin' nothin' all night long\n" +
                "\n" +
                "All night long\n" +
                "All night long\n" +
                "All night long\n" +
                "All night long\n" +
                "\n" +
                "I've been California dreamin' (dreamin')\n" +
                "Plastic hearts are bleedin' (are bleedin')\n" +
                "Keep me up all night, yeah (keep me up)\n" +
                "Keep me up all night (all night)\n" +
                "Lost in black hole conversations\n" +
                "Sunrise suffocation (suffocation)\n" +
                "Keep me up all night (keep me up, oh yeah)\n" +
                "Keep me up all night\n" +
                "\n" +
                "I just wanna feel (feel)\n" +
                "I just wanna feel somethin' (feel somethin' now)\n" +
                "But I keep feelin' nothin' all night long"
    }
}
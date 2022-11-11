package com.uniandes.vynilsapp.data.db

import com.uniandes.vynilsapp.data.model.*

class ArtistMock {

    companion object {

        val artistList = listOf<Performer>(
            Performer(
                100,
                "Rubén Blades Bellido de Luna",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/Ruben_Blades_by_Gage_Skidmore.jpg/800px-Ruben_Blades_by_Gage_Skidmore.jpg",
                "Es un cantante, compositor, músico, actor, abogado, político y activista panameño. Ha desarrollado gran parte de su carrera artística en la ciudad de Nueva York.",
                "1948-07-16T00:00:00.000Z",
                listOf<Album>(
                    Album(
                        101,
                        "Poeta del pueblo",
                        "https://cdn.shopify.com/s/files/1/0275/3095/products/image_4931268b-7acf-4702-9c55-b2b3a03ed999_1024x1024.jpg",
                        "1984-08-01T00:00:00.000Z",
                        "Recopilación de 27 composiciones del cosmos Blades que los bailadores y melómanos han hecho suyas en estos 40 años de presencia de los ritmos y concordias afrocaribeños en múltiples escenarios internacionales. Grabaciones de Blades para la Fania con las orquestas de Pete Rodríguez, Ray Barreto, Fania All Stars y, sobre todo, los grandes éxitos con la Banda de Willie Colón",
                        "Salsa",
                        "Elektra",
                        listOf<Track>(),
                        listOf<Performer>(),
                        listOf<Comment>()
                    ),
                    Album(100,
                        "Buscando América",
                        "https://i.pinimg.com/564x/aa/5f/ed/aa5fed7fac61cc8f41d1e79db917a7cd.jpg",
                        "1984-08-01T00:00:00.000Z",
                        "Buscando América es el primer álbum de la banda de Rubén Blades y Seis del Solar lanzado en 1984. La producción, bajo el sello Elektra, fusiona diferentes ritmos musicales tales como la salsa, reggae, rock, y el jazz latino. El disco fue grabado en Eurosound Studios en Nueva York entre mayo y agosto de 1983.",
                        "Salsa",
                        "Elektra",
                        listOf<Track>(),
                        listOf<Performer>(),
                        listOf<Comment>()
                    )
                ),
                listOf<PerformerPrize>(
                    PerformerPrize(
                        100,
                        "1978-12-10T00:00:00.000Z"
                    )
                )
            )
        )

    }

}
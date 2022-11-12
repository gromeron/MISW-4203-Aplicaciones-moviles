package com.uniandes.vynilsapp.data.db

import com.uniandes.vynilsapp.data.model.*

class AlbumMock {

    companion object {

        val albumList = listOf<Album>(
            Album(
                100,
                "Buscando América",
                "https://i.pinimg.com/564x/aa/5f/ed/aa5fed7fac61cc8f41d1e79db917a7cd.jpg",
                "1984.08.01T00:00:00.000Z",
                "Buscando América es el primer álbum de la banda de Rubén Blades y Seis del Solar lanzado en 1984. La producción, bajo el sello Elektra, fusiona diferentes ritmos musicales tales como la salsa, reggae, rock, y el jazz latino. El disco fue grabado en Eurosound Studios en Nueva York entre mayo y agosto de 1983.",
                "Salsa",
                "Elektra",
                listOf<Track>(
                    Track(
                        100,
                        "Decisiones",
                        "5:05"
                    ),
                    Track(101,
                        "Desapariciones",
                        "6:29"
                    )
                ),
                listOf<Performer>(
                    Performer(
                        100,
                        "Rubén Blades Bellido de Luna",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/Ruben_Blades_by_Gage_Skidmore.jpg/800px-Ruben_Blades_by_Gage_Skidmore.jpg",
                        "Es un cantante, compositor, músico, actor, abogado, político y activista panameño. Ha desarrollado gran parte de su carrera artística en la ciudad de Nueva York.",
                        "1948-07-16T00:00:00.000Z",
                        listOf<Album>(),
                        listOf<PerformerPrize>(),
                        ""
                    )
                ),
                listOf<Comment>(
                    Comment(
                        100,
                        "The most relevant album of Ruben Blades",
                        5
                    )
                )
            ),
            Album(
                101,
                "Poeta del pueblo",
                "https://cdn.shopify.com/s/files/1/0275/3095/products/image_4931268b-7acf-4702-9c55-b2b3a03ed999_1024x1024.jpg",
                "1984-08-01T00:00:00.000Z",
                "Recopilación de 27 composiciones del cosmos Blades que los bailadores y melómanos han hecho suyas en estos 40 años de presencia de los ritmos y concordias afrocaribeños en múltiples escenarios internacionales. Grabaciones de Blades para la Fania con las orquestas de Pete Rodríguez, Ray Barreto, Fania All Stars y, sobre todo, los grandes éxitos con la Banda de Willie Colón",
                "Salsa",
                "Elektra",
                listOf<Track>(),
                listOf<Performer>(
                    Performer(
                        100,
                        "Rubén Blades Bellido de Luna",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/Ruben_Blades_by_Gage_Skidmore.jpg/800px-Ruben_Blades_by_Gage_Skidmore.jpg",
                        "Es un cantante, compositor, músico, actor, abogado, político y activista panameño. Ha desarrollado gran parte de su carrera artística en la ciudad de Nueva York.",
                         "1948-07-16T00:00:00.000Z",
                            listOf<Album>(),
                            listOf<PerformerPrize>(),
                        ""
                    )
                ),
                listOf<Comment>()
            ),
            Album(
                102,
                "A Night at the Opera",
                "https://upload.wikimedia.org/wikipedia/en/4/4d/Queen_A_Night_At_The_Opera.png",
                "1975-11-21T00:00:00.000Z",
                "Es el cuarto álbum de estudio de la banda británica de rock Queen, publicado originalmente en 1975. Coproducido por Roy Thomas Baker y Queen, A Night at the Opera fue, en el tiempo de su lanzamiento, la producción más cara realizada.1​ Un éxito comercial, el álbum fue votado por el público y citado por publicaciones musicales como uno de los mejores trabajos de Queen y de la historia del rock.",
                "Rock",
                "EMI",
                listOf<Track>(),
                listOf<Performer>(
                    Performer(
                        101,
                        "Queen",
                        "https://pm1.narvii.com/6724/a8b29909071e9d08517b40c748b6689649372852v2_hq.jpg",
                        "Queen es una banda británica de rock formada en 1970 en Londres por el cantante Freddie Mercury, el guitarrista Brian May, el baterista Roger Taylor y el bajista John Deacon. Si bien el grupo ha presentado bajas de dos de sus miembros (Mercury, fallecido en 1991, y Deacon, retirado en 1997), los integrantes restantes, May y Taylor, continúan trabajando bajo el nombre Queen, por lo que la banda aún se considera activa.",
                        "1970-01-01T00:00:00.000Z",
                        listOf<Album>(),
                        listOf<PerformerPrize>(),
                        ""
                    )
                ),
                listOf<Comment>(
                    Comment(
                        101,
                        "I love this album of Queen",
                        5
                    )
                )
            )
        )
    }

}
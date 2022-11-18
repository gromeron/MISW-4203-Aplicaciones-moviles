package com.uniandes.vynilsapp.data.db

import com.uniandes.vynilsapp.data.model.*

class CollectorMock {

    companion object {

        val collectorList = listOf<Collector>(
            Collector(
                100,
                "Manolo Bellon",
                "3502457896",
                "manollo@caracol.com.co",
                listOf<CollectorAlbum>(
                    CollectorAlbum(
                        100,
                        35,
                        "Active"
                    )
                ),
                listOf<Comment>(
                  Comment(
                      100,
                      "The most relevant album of ruben blades",
                      5
                  )
                ),
                listOf<FavoritePerformer>(
                    FavoritePerformer(
                        101,
                        "Queen",
                        "https://pm1.narvii.com/6724/a8b29909071e9d08517b40c748b6689649372852v2_hq.jpg",
                        "Queen es una banda británica de rock formada en 1970 en Londres por el cantante Freddie Mercury, el guitarrista Brian May, el baterista Roger Taylor y el bajista John Deacon. Si bien el grupo ha presentado bajas de dos de sus miembros (Mercury, fallecido en 1991, y Deacon, retirado en 1997), los integrantes restantes, May y Taylor, continúan trabajando bajo el nombre Queen, por lo que la banda aún se considera activa.",
                        "1970-01-01T00:00:00.000Z"
                    )
                )
            )
        )

    }

}
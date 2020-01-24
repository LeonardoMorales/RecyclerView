package com.example.recyclerview.data

import com.example.recyclerview.model.BlogPost
import com.example.recyclerview.model.Hashtag

class DataSource{
    companion object {
        fun createDataSet(): ArrayList<BlogPost> {

            val list = ArrayList<BlogPost>()

            list.add(
                BlogPost(
                    "Jimmy",
                    "https://firebasestorage.googleapis.com/v0/b/quantum-eaa36.appspot.com/o/BlogPost%20Images%2Fhawaii-1867849_1280.jpg?alt=media&token=688efd27-571f-4fd6-81b7-2ad1c162a792",
                    "Viaje a Hawaii",
                    1518825600,
                    arrayOf(Hashtag("Viaje"), Hashtag("Hawaii"))
                )
            )
            list.add(
                BlogPost(
                    "Mark",
                    "https://firebasestorage.googleapis.com/v0/b/quantum-eaa36.appspot.com/o/BlogPost%20Images%2Fconcert-2527495_1280.jpg?alt=media&token=8628184c-f07b-4fc7-8455-be5b1bee1ec2",
                    "Fiesta con amigos",
                    1459555200,
                    arrayOf(Hashtag("Amigos"), Hashtag("Fiesta"), Hashtag("Alcohol"))
                )
            )
            list.add(
                BlogPost(
                    "Marie",
                    "https://firebasestorage.googleapis.com/v0/b/quantum-eaa36.appspot.com/o/BlogPost%20Images%2Fsparkler-677774_1920.jpg?alt=media&token=b23733a1-cdc7-46c8-9711-8e926e934b97",
                    "Año Nuevo",
                    1546300800,
                    arrayOf(Hashtag("Deseos"), Hashtag("Propósitos"))
                )
            )
            list.add(
                BlogPost(
                    "Alice",
                    "https://firebasestorage.googleapis.com/v0/b/quantum-eaa36.appspot.com/o/BlogPost%20Images%2Fchildren-817365_1920.jpg?alt=media&token=cf958feb-e91a-4ca3-9087-d5f71b460cfb",
                    "Paseo familiar",
                    1545436800,
                    arrayOf(Hashtag("Hijos"), Hashtag("Hermanos"), Hashtag("Bebés"))
                )
            )
            list.add(
                BlogPost(
                    "Rachel",
                    "https://firebasestorage.googleapis.com/v0/b/quantum-eaa36.appspot.com/o/BlogPost%20Images%2Friver-690374_1920.jpg?alt=media&token=0b8ace85-2fa8-46ab-a8be-28956138f132",
                    "Visitando Hamburgo",
                    1515888000,
                    arrayOf(Hashtag("Hamburgo"), Hashtag("River"))
                )
            )
            list.add(
                BlogPost(
                    "Marie",
                    "https://firebasestorage.googleapis.com/v0/b/quantum-eaa36.appspot.com/o/BlogPost%20Images%2Fworkplace-1245776_1920.jpg?alt=media&token=902dab8a-8baa-4db3-bd92-c8925324ed83",
                    "Junta con el equipo de marketing",
                    1558224000,
                    arrayOf(Hashtag("Metting"), Hashtag("Work"), Hashtag("Marketing"))
                )
            )
            list.add(
                BlogPost(
                    "Bradley",
                    "https://firebasestorage.googleapis.com/v0/b/quantum-eaa36.appspot.com/o/BlogPost%20Images%2Fbiker-384921_1920.jpg?alt=media&token=54cad102-36e9-4e2c-8897-0acb84e5bd2c",
                    "Deporte extremo",
                    1578700800,
                    arrayOf(Hashtag("Extreme"), Hashtag("Sport"), Hashtag("Biker"))
                )
            )
            list.add(
                BlogPost(
                    "Meghan",
                    "https://firebasestorage.googleapis.com/v0/b/quantum-eaa36.appspot.com/o/BlogPost%20Images%2Ftulip-flower-4762986_1920.jpg?alt=media&token=e7f05681-3d01-4a24-b22c-31d76d8c8667",
                    "Tulipan",
                    1543536000,
                    arrayOf(Hashtag("Flores"), Hashtag("Naturaleza"))
                )
            )

            return list
        }
    }
}
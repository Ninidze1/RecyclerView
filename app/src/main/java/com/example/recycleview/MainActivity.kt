package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycleView)


        val cars = ArrayList<CarList>()

        cars.add(CarList("https://images.iconfigurators.app/images/gallery/Untitled-52_7148.jpg"))
        cars.add(CarList("https://cdntdreditorials.azureedge.net/media/81729/2017-lexus-rx-350-01-jm.jpg?anchor=center&mode=crop&width=300&height=155&rnd=131394798320000000"))
        cars.add(CarList("https://miro.medium.com/max/4410/1*zNqFF9x9-JhfND7eRiGFqw.jpeg"))
        cars.add(CarList("https://lh3.googleusercontent.com/proxy/z1EnMifJQmWFLkoC2fGiDoeZb4XG-6CidAMylEL-oQMy6aFPFrpnFgZReSNM2E1-82xQPQ4bwaX8E3yUZJDh2Vk2Jv_JkMJD4pGcd2WAy6UOhq15F3ReM96Gr2HuSbcUEhZnglkfoHc"))
        cars.add(CarList("https://media.ed.edmunds-media.com/mercedes-benz/cla-class/2020/oem/2020_mercedes-benz_cla-class_sedan_amg-cla-45_fq_oem_2_500.jpg"))
        cars.add(CarList("https://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2018/06/21210347/nissan-silvia-spec-r-dave-thomas-speedhunters-1.jpg"))
        cars.add(CarList("https://3.bp.blogspot.com/-EgNvHWOCDpU/WfIwjTXmhyI/AAAAAAAAADM/zQK6oMopk-YIPaSCNeJY02CDkT-YcPKigCPcBGAYYCw/s1600/Black-Toyota-GT86-Rocket-Bunny.jpg"))
        cars.add(CarList("https://ae01.alicdn.com/kf/H770f19ddb81d4f96b2cdb66f30b95495w/Z-ART-carbon-fiber-rear-spoiler-for-Lexus-IS200t-IS250-IS300-IS300F-2017-2018-carbon-fiber.jpg"))
        cars.add(CarList("https://i.pinimg.com/originals/69/b9/bf/69b9bf340c02c57ececd76feb6ec1923.jpg"))
        cars.add(CarList("https://i.pinimg.com/originals/c0/ab/d8/c0abd85e2014984407f57b3261fe3a24.jpg"))
        cars.add(CarList("https://i.gaw.to/content/photos/34/52/345210_2018_Genesis_G80.jpg"))
        cars.add(CarList("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_TQ498fv4RNiFmRjDhKlnj6uDdNNQ3iwALg&usqp=CAU"))
        cars.add(CarList("https://cdn.motor1.com/images/mgl/0xeBm/s1/2020-hyundai-sonata-u-s.jpg"))
        cars.add(CarList("https://www.mercedes-benz.com/en/vehicles/passenger-cars/mercedes-maybach/mercedes-maybach-gls/_jcr_content/root/paragraph/paragraph-right/paragraphimage/image/MQ6-8-image-20191121124358/02-mercedes-benz-2020-mercedes-maybach-gls-600-4matic-x167-two-colour-paint-rubellite-red-obsidian-black-2560x1440.jpeg"))
        cars.add(CarList("https://www.bimmerboost.com/images/imported/2020/10/ogi32020porschetaycan007-1.jpg"))
        cars.add(CarList("https://briff.me/wp-content/uploads/2015/02/Horse-Power-Car-2-Horse-Pulling-Half-Car.jpg"))
        cars.add(CarList("https://cdn.jdpower.com/JDPA_2020%20Audi%20A3%20Dark%20Gray%20Front%20View.jpg"))
        cars.add(CarList("https://s.marketwatch.com/public/resources/images/MW-HY837_at_gla_ZH_20200122173813.jpg"))
        cars.add(CarList("https://etimg.etb2bimg.com/photo/73164879.cms"))
        cars.add(CarList("https://i.insider.com/5be2fcc0110d4c585811aff6?width=1100&format=jpeg&auto=webp"))
        cars.add(CarList("https://thumbor.forbes.com/thumbor/trim/299x201:2851x1638/fit-in/711x400/smart/https://specials-images.forbesimg.com/imageserve/5d37046395e0230008f64edf/0x0.jpg"))
        cars.add(CarList("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTJNGufawYAk1PN1RozpKODB4faMxxD9VAO2g&usqp=CAU"))
        cars.add(CarList("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ0ewl3g3NVFtXtvlaPrNbqFVqRglzUG-_B0A&usqp=CAU"))
        cars.add(CarList("https://www.teahub.io/photos/full/360-3604279_disney-cars-transparent-background.jpg"))
        cars.add(CarList("https://i.pinimg.com/originals/2d/89/bb/2d89bb06d1adf2c5d7982cd9b05d8c3f.png"))
        cars.add(CarList("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRpUNAIdDSLSBPE80qbfjhdXGfECI1MWMe01Q&usqp=CAU"))
        cars.add(CarList("https://p.kindpng.com/picc/s/396-3964455_fh4-peel-p50-render-peel-p50-car-memes.png"))
        cars.add(CarList("https://m.atcdn.co.uk/ect/media/w900/a584c7b7137a484eaf493d57fde4bd87.jpg"))
        cars.add(CarList("https://t1-cms-3.images.toyota-europe.com/toyotaone/gben/business%20customers%20mobile%20header_tcm-3060-675772.jpg"))
        cars.add(CarList("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkPGwuffkiEyEtv3N-Lzx0ZEUGArM91_A62Q&usqp=CAU"))
        cars.add(CarList("https://lh3.googleusercontent.com/proxy/34woGufHGZEOipL83N0kVdPRQUIaPCXXykQzewbS1oPagsk3mVs-siH6Ox9YPJeQ_Ut6cjV-sfV_qjkaRnaNNZ1mtLHN53Ok9Lej3u0udSX0gvV-xXMy7H0x"))
        cars.add(CarList("https://www.nationwidevehiclecontracts.co.uk/m/2/discovery-commercial-hse.JPG"))
        cars.add(CarList("https://assets.bwbx.io/images/users/iqjWHBFdfxIU/iho0QqgeF4K8/v1/1000x-1.jpg"))
        cars.add(CarList("https://media.wired.com/photos/5d09594a62bcb0c9752779d9/1:1/w_1500,h_1500,c_limit/Transpo_G70_TA-518126.jpg"))
        cars.add(CarList("https://cnet1.cbsistatic.com/img/seh3SoGxjdV5NUpTXU3Ui0hCgK0=/940x528/2020/07/16/e7c93429-ee6d-4f1b-9fa2-cd77132f8943/2021-mini-john-cooper-works-gp-1.jpg"))
        cars.add(CarList("https://static.carthrottle.com/workspace/uploads/posts/2016/01/ce166f64a5b22759351ccacbbf02cc0b.jpg"))




        val carAdapter = CarAdapter(cars)

        recyclerView.layoutManager = GridLayoutManager(this, 2)

        recyclerView.adapter = carAdapter


    }
}
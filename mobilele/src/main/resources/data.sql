insert into roles (name)
    value ('Admin'),
    ('User');
insert into brands (name, created, modified)
    value ('Mercedes', '1925-02-18', now()),
    ('BMW', '1916-03-07', now()),
    ('Ford', '1903-06-16', now()),
    ('Porsche', '1931-04-25', now()),
    ('Toyota', '1937-08-28', now());
insert into models (name, category, image_url, start_year, end_year, created, modified, brand_id)
    values ('S-Class', 0, 'https://stimg.cardekho.com/images/carexteriorimages/930x620/Mercedes-Benz/S-Class/10853/1690451611932/front-left-side-47.jpg?impolicy=resize&imwidth=420', 1972, null, now(), now(), 1),
    ('GLA', 0, 'https://www.autocar.co.uk/sites/autocar.co.uk/files/styles/gallery_slide/public/1-mercedes-benz-gla-2020-fd-hero-front.jpg?itok=f3IUj8UA', 2013, null, now(), now(), 1),
    ('C-Class', 0, 'https://images.hgmsites.net/lrg/2022-mercedes-benz-c-class-c-300-sedan-angular-front-exterior-view_100847662_l.jpg', 1993, null, now(), now(), 1),
    ('E-Class', 0, 'https://stimg.cardekho.com/images/carexteriorimages/930x620/Mercedes-Benz/E-Class/10855/1690452177573/front-left-side-47.jpg', 1994, null, now(), now(), 1),
    ('G-Class', 0, 'https://www.autocar.co.uk/sites/autocar.co.uk/files/styles/gallery_slide/public/1-mercedes-benz-g-class-2019-rt-hero-front.jpg?itok=kG4plfw1', 1979, null, now(), now(), 1),
    ('X-Series', 0, 'https://www.bmw.bg/content/dam/bmw/common/all-models/x-series/x1/2022/navigation/bmw-x-series-x1-phev-modelfinder.png/jcr:content/renditions/cq5dam.resized.img.585.low.time1676309079908.png', 1999, null, now(), now(), 2),
    ('M-Series', 0, 'https://hips.hearstapps.com/hmg-prod/images/2020-bmw-m8-competition-coupe-112-1570575779.jpg', 1972, null, now(), now(), 2),
    ('I-Series', 0, 'https://static.toiimg.com/photo/msid-87209346/87209346.jpg', 2011, null, now(), now(), 2),
    ('Z-Series', 0, 'https://images.prismic.io/shacarlacca%2F4ee38b9f-be6f-4f00-925a-a06d562018bb_p90183182_highres_the-new-bmw-z4-in-es.jpg?auto=compress,format&rect=0,72,1300,722&w=1440&h=800', 1989, null, now(), now(), 2),
    ('PHEV-Series', 0, 'https://media.ed.edmunds-media.com/bmw/x5/2021/oem/2021_bmw_x5_4dr-suv_xdrive45e_fq_oem_1_1280.jpg', 2022, null, now(), now(), 2),
    ('Ranger', 0, 'https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/all-new-ford-ranger-raptor-02-1-645a6eb5b881d.jpg?crop=0.447xw:1.00xh;0.177xw,0&resize=640:*', 1983, null, now(), now(), 3),
    ('Focus', 0, 'https://upload.wikimedia.org/wikipedia/commons/1/19/Ford_Focus_1.0_EcoBoost_Hybrid_ST-Line_%28IV%2C_Facelift%29_%E2%80%93_f_24092022.jpg', 1983, 2021, now(), now(), 3),
    ('Mustang', 0, 'https://upload.wikimedia.org/wikipedia/commons/2/2b/Seventh_generation_2024_Ford_Mustang_%28cropped%29.jpg', 1964, null, now(), now(), 3),
    ('F150', 0, 'https://upload.wikimedia.org/wikipedia/commons/3/39/Ford_F-150_Lariat_Luxury_2022.jpg', 1948, null, now(), now(), 3),
    ('Explorer', 0, 'https://upload.wikimedia.org/wikipedia/commons/e/e0/Ford_Explorer_PHEV_1X7A6478.jpg', 1990, null, now(), now(), 3),
    ('Cayenne', 0, 'https://upload.wikimedia.org/wikipedia/commons/c/c3/Porsche_Cayenne_%28PO536%29_GTS_IMG_3952.jpg', 2002, null, now(), now(), 4),
    ('Macan', 0, 'https://upload.wikimedia.org/wikipedia/commons/3/3f/2022_Porsche_Macan_GTS_Auto_Zuerich_2021_IMG_0044.jpg', 2014, null, now(), now(), 4),
    ('911', 0, 'https://upload.wikimedia.org/wikipedia/commons/3/37/Porsche_992_Turbo_IMG_3522.jpg', 1964, null, now(), now(), 4),
    ('Boxster', 0, 'https://upload.wikimedia.org/wikipedia/commons/2/2d/Porsche_718_Boxster_Spyder_IMG_2961.jpg', 1966, null, now(), now(), 4),
    ('Panamera', 0, 'https://upload.wikimedia.org/wikipedia/commons/d/d4/JAIA18_Porsche_Panamera_4_E-Hybrid_97ABE1_1.jpg', 2010, null, now(), now(), 4),
    ('Avalon', 0, 'https://upload.wikimedia.org/wikipedia/commons/8/8c/2019_Toyota_Avalon_XSE_in_Ruby_Flare_Pearl%2C_Front_Right%2C_09-05-2022.jpg', 1994, null, now(), now(), 5),
    ('Belta', 0, 'https://upload.wikimedia.org/wikipedia/commons/a/af/2022_Toyota_Belta_Smart_%28Egypt%29_front_view_01.png', 2005, null, now(), now(), 5),
    ('Camry', 0, 'https://upload.wikimedia.org/wikipedia/commons/3/3e/2022_Toyota_Camry_SE_Standard_Package_in_Celestial_Silver_Metallic%2C_Front_Left%2C_08-06-2022.jpg', 1982, null, now(), now(), 5),
    ('Century', 0, 'https://upload.wikimedia.org/wikipedia/commons/7/73/Toyota_Century_3rd_generation_2017_Tokyo_Motor_Show_front_1_%28cropped%29.jpg', 1967, null, now(), now(), 5),
    ('Corolla', 0, 'https://upload.wikimedia.org/wikipedia/commons/9/90/Toyota_Corolla_Limousine_Monrepos_2019_IMG_1908.jpg', 1966, null, now(), now(), 5);
insert into users (email, password, first_name, last_name, active, role_id, created, modified)
    values ('dummy1@gmail.com', 'topsecret', 'dummyFirstName1', 'dummyLastName1', true, 1, now(), now()),
    ('dummy2@gmail.com', 'topsecret', 'dummyFirstName2', 'dummyLastName2', true, 2, now(), now()),
    ('dummy3@gmail.com', 'topsecret', 'dummyFirstName3', 'dummyLastName3', true, 2, now(), now()),
    ('dummy4@gmail.com', 'topsecret', 'dummyFirstName4', 'dummyLastName4', true, 2, now(), now()),
    ('dummy5@gmail.com', 'topsecret', 'dummyFirstName5', 'dummyLastName5', true, 2, now(), now());
insert into offers (description, created, engine, mileage, modified, price, transmission, year, model_id, user_id)
    values ('someDummyText', now(), 2, 10000, now(), 100000, 1, 2023, 1, 1),
    ('someDummyText', now(), 1, 5000, now(), 90000, 0, 2023, 2, 2),
    ('someDummyText', now(), 3, 12000, now(), 80000, 1, 2023, 3, 3),
    ('someDummyText', now(), 0, 8000, now(), 70000, 0, 2023, 4, 4),
    ('someDummyText', now(), 0, 13000, now(), 60000, 0, 2023, 5, 5);


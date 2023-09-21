insert into roles (name)
    value ('Admin'),
    ('User');
insert into brands (name, created, modified)
    value ('Mercedes', '1925-02-18', now()),
    ('BMW', '1916-03-07', now()),
    ('Ford', '1903-06-16', now()),
    ('Porsche', '1931-04-25', now()),
    ('Toyota', '1937-08-28', now());
insert into models (name, category, image_url, start_year, created, modified, brand_id)
    values ('S-Class', 1, 'https://stimg.cardekho.com/images/carexteriorimages/930x620/Mercedes-Benz/S-Class/10853/1690451611932/front-left-side-47.jpg?impolicy=resize&imwidth=420', 1972, now(), now(), 1),
    ('X-Series', 1, 'https://www.bmw.bg/content/dam/bmw/common/all-models/x-series/x1/2022/navigation/bmw-x-series-x1-phev-modelfinder.png/jcr:content/renditions/cq5dam.resized.img.585.low.time1676309079908.png', 1999, now(), now(), 2),
    ('Ranger', 1, 'https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/all-new-ford-ranger-raptor-02-1-645a6eb5b881d.jpg?crop=0.447xw:1.00xh;0.177xw,0&resize=640:*', 1983, now(), now(), 3),
    ('Cayenne', 1, 'https://files.porsche.com/filestore/image/multimedia/none/e3-2nd-cayenne-modelimage-sideshot/model/b14f4d31-e03d-11ed-8101-005056bbdc38/porsche-model.png', 2002, now(), now(), 4),
    ('Land Cruiser', 1, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQx73yt-Os7Naza2rnzB1KrhBEV-yXTj_Qynw&usqp=CAU', 1951, now(), now(), 5);
insert into users (email, password, first_name, last_name, active, role_id, created, modified)
    values ('dummy1@gmail.com', 'topsecret', 'dummyFirstName1', 'dummyLastName1', true, 1, now(), now()),
    ('dummy2@gmail.com', 'topsecret', 'dummyFirstName2', 'dummyLastName2', true, 2, now(), now()),
    ('dummy3@gmail.com', 'topsecret', 'dummyFirstName3', 'dummyLastName3', true, 2, now(), now()),
    ('dummy4@gmail.com', 'topsecret', 'dummyFirstName4', 'dummyLastName4', true, 2, now(), now()),
    ('dummy5@gmail.com', 'topsecret', 'dummyFirstName5', 'dummyLastName5', true, 2, now(), now());
insert into offers (description, created, engine, mileage, modified, price, transmission, year, model_id, user_id)
    values ('someDummyText', now(), 3, 10000, now(), 100000, 2, 2023, 1, 1),
    ('someDummyText', now(), 2, 5000, now(), 90000, 1, 2023, 2, 2),
    ('someDummyText', now(), 4, 12000, now(), 80000, 2, 2023, 3, 3),
    ('someDummyText', now(), 1, 8000, now(), 70000, 1, 2023, 4, 4),
    ('someDummyText', now(), 1, 13000, now(), 60000, 1, 2023, 5, 5);


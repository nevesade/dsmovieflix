INSERT INTO tb_user (name, email, password) VALUES ('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Bob Brown', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');


INSERT INTO tb_role (authority) VALUES ('ROLE_VISITOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_MEMBER');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);



INSERT INTO tb_genre (name) VALUES ('Animação');
INSERT INTO tb_genre (name) VALUES ('Crime');
INSERT INTO tb_genre (name) VALUES ('Comédia');




INSERT INTO tb_movie ( title, sub_Title, year, img_Url, synopsis) VALUES (' Os Croods 2 (2020) ', 'Os Croods 2: UMA NOVA ERA', 2020, 'https://image.tmdb.org/t/p/w220_and_h330_face/ldjx1dVWI4nKKtvvXjxP0HjAsjz.jpg', 'Sequência de Os Croods, aventura sobre uma família pré-histórica que descobre as transformações no mundo enquanto tenta permanecer unida.' );
INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis) VALUES (  ' Borat  (2020) ', ' Borat, o Filme Seguinte (2020) ', 2020, 'https://image.tmdb.org/t/p/w533_and_h300_bestv2/hbrXbVoE0NuA1ORoSGGYNASagrl.jpg', 'O novo filme segue as aventuras contínuas do jornalista de televisão cazaque Borat (Sacha Baron Cohen) quando é enviado à América. Desta vez, ele traz a sua filha e os dois continuam a causar estragos junto de pessoas desprevenidas em todos os sítios a que vão durante a pandemia do coronavírus.' );
INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis) VALUES (  ' Bronx', '  Cidade Corrupta (2020)  ', 2020, 'https://image.tmdb.org/t/p/w440_and_h660_face/hSpm2mMbkd0hLTRWBz0zolnLAyK.jpg', 'Apanhado entre a corrupção policial e dois gangues marselheses em guerra, um polícia leal tem de agir por conta própria para proteger a sua equipa.' );
INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis) VALUES (  ' Project Power', ' Project Power: Descobre o Poder (2020) ', 2020, 'https://image.tmdb.org/t/p/w1066_and_h600_bestv2/qVygtf2vU15L2yKS4Ke44U4oMdD.jpg', 'Os caminhos de um ex-soldado, uma adolescente e um polícia cruzam-se em Nova Orleães, enquanto procuram a fonte de uns novos comprimidos que provocam poderes temporários.' );
INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis) VALUES (  '  Ava (2020) ', ' Matar ou ser morto. ', 2020, 'https://image.tmdb.org/t/p/w440_and_h660_face/uobkkvvKCZbTKpJCMnvuTRQt5bV.jpg', 'Ava é uma assassina perigosa, especializada em alvos difíceis e ao serviço de uma organização de forças especiais secreta. Quando um trabalho corre mal, ela terá de arranjar um modo de sobreviver à situação em que a colocaram.' );
INSERT INTO tb_movie ( title,sub_Title, year, img_Url, synopsis) VALUES (  ' The SpongeBob Movie: Sponge on the Run ', '  SpongeBob: Esponja em Missão (2020)  ', 2020, 'https://image.tmdb.org/t/p/w440_and_h660_face/7uioNxYrl2Mb8WyNWzs2MPy7EpA.jpg', 'Depois de Gary, o adorado caracol de estimação de SpongeBob, ter sido capturado, SpongeBob e Patrick embarcam numa épica aventura para A Cidade Perdida de Atlantic City para trazerem Gary de volta a casa. Enquanto navegam pelos encantos e perigos desta hilariante missão de resgate, SpongeBob e os seus amigos provam que não existe nada mais forte que o poder da amizade.' );
INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis) VALUES (  ' Onward ', '  Dois Irmãos - Uma Jornada Fantástica (2020) ', 2020, 'https://image.tmdb.org/t/p/w1066_and_h600_bestv2/xFxk4vnirOtUxpOEWgA1MCRfy6J.jpg', 'Num mundo de fantasia urbano, dois irmãos elfos adolescentes, Ian e Barley Lightfoot, embarcam numa aventura para descobrir se ainda resta um pouco de magia para passar um último dia com o pai que morreu quando eles eram muito novos.' );
INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis) VALUES (  '  Frozen II', '  Frozen 2 - O Reino Gelado (2019)  ', 2020, 'https://image.tmdb.org/t/p/w1066_and_h600_bestv2/xJWPZIYOEFIjZpBL7SVBGnzRYXp.jpg', 'Porque será que Elsa nasceu com poderes mágicos? A resposta está a atormentá-la e a ameaçar o seu reino. Juntamente com Anna, Kristoff, Olaf e Sven, ela parte numa perigosa e memorável aventura. Em "Frozen", Elsa temia que os seus poderes fossem demais para o mundo, em "Frozen 2" espera que sejam suficientes.' );
INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis) VALUES ( 'Ralph Breaks the Internet  ', ' Quem estragou a internet? ', 2020, 'https://image.tmdb.org/t/p/w1066_and_h600_bestv2/88poTBTafMXaz73vYi3c74g0y2k.jpg', 'Ralph deixa o videojogo de Litwak para trás e aventura-se no enorme e excitante mundo da internet – que pode ou não sobreviver à sua força. Ralph, o vilão dos videojogos e a sua companheira Vanellope Von Schweetz, vão arriscar tudo no universo da web para procurarem uma peça que irá salvar o videojogo de Vanellope, o Sugar Rush, e irão contar com o apoio dos netcidadãos.' );
INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis) VALUES ( ' Target Number One (2020) ', '  Target Number One (2020)  ', 2020, 'https://image.tmdb.org/t/p/w440_and_h660_face/hTQ6CVyA95dYKKbAW8F7srtORDx.jpg', 'Ex heroin junkie, Daniel Léger, gets involved in a drug deal with the wrong people for the wrong reasons. When the deal goes sour, Daniel gets thrown into a Thai prison and slapped with a 100-year sentence. While he tries to survive his Bangkok incarceration, the news of his conviction captures the attention of Globe and Mail journalist Victor Malarek, who decides to go after the shady undercover cops responsible for wrongly accusing Daniel.' );


INSERT INTO tb_movie_genre (movie_id, genre_id) VALUES (1, 1);
INSERT INTO tb_movie_genre (movie_id, genre_id) VALUES (2, 2);
INSERT INTO tb_movie_genre (movie_id, genre_id) VALUES (3, 2);
INSERT INTO tb_movie_genre (movie_id, genre_id) VALUES (4, 2);
INSERT INTO tb_movie_genre (movie_id, genre_id) VALUES (5, 3);
INSERT INTO tb_movie_genre (movie_id, genre_id) VALUES (6, 3);
INSERT INTO tb_movie_genre (movie_id, genre_id) VALUES (7, 3);
INSERT INTO tb_movie_genre (movie_id, genre_id) VALUES (8, 1);
INSERT INTO tb_movie_genre (movie_id, genre_id) VALUES (9, 1);
INSERT INTO tb_movie_genre (movie_id, genre_id) VALUES (10, 2);


INSERT INTO tb_review (movie_id, user_id, text) VALUES (1, 1, 'role visitor não podera adionar review on movie');
INSERT INTO tb_review (movie_id, user_id, text) VALUES (2, 2, 'Good movie');
INSERT INTO tb_review (movie_id, user_id, text) VALUES (3, 2, 'Good movie');
INSERT INTO tb_review (movie_id, user_id, text) VALUES (4, 2, 'Good movie');
INSERT INTO tb_review (movie_id, user_id, text) VALUES (5, 2, 'Good movie');
INSERT INTO tb_review (movie_id, user_id, text) VALUES (6, 2, 'Good movie');
INSERT INTO tb_review (movie_id, user_id, text) VALUES (7, 3, 'Good movie');
INSERT INTO tb_review (movie_id, user_id, text) VALUES (8, 3, 'Good movie');
INSERT INTO tb_review (movie_id, user_id, text) VALUES (9, 3, 'Good movie');
INSERT INTO tb_review (movie_id, user_id, text) VALUES (10,3, 'Good movie');
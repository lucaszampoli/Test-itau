-- A ordem dos valores está relacionada ao nome dos campo.
INSERT INTO "public"."order_main" VALUES (2147483649, 'rua lua 49', 'customer2@email.com', 'customer2', '2343456', '2020-05-17 12:58:23.824', 120.00, 0, '2020-05-17 12:58:23.824');

-- ----------------------------
-- Estrutura da tabela para produto & categoria

-- ----------------------------
-- Dados de produto & categoria
-- ----------------------------
INSERT INTO "public"."product_category" VALUES (2147483641, 'Vestuario', 2, '2020-05-17 00:22:02', '2020-05-17 00:22:21');


-- ----------------------------
-- Dados e Informacoes dos Pedidos
-- ----------------------------
INSERT INTO "public"."product_in_order" VALUES (2147483634, 2,1, 'Chinelo legal', 'https://imgcentauro-a.akamaihd.net/500x500/924656TD/chinelo-havaianas-hype-fc-masculino-img.jpg', 'C0001', 'Chinelo', 60.00, 20,NULL, 2147483649);
INSERT INTO "public"."product_in_order" VALUES (2147483649, 2,1, 'Chinelo legal', 'https://imgcentauro-a.akamaihd.net/500x500/924656TD/chinelo-havaianas-hype-fc-masculino-img.jpg', 'C0001', 'Chinelo', 60.00, 20,NULL, 2147483649);

-- ----------------------------
-- Dados e Informacoes dos Produtos
-- ----------------------------
INSERT INTO "public"."product_info" VALUES ('C0001', 2, '2020-05-17 12:09:41', 'Chinelo legal', 'https://imgcentauro-a.akamaihd.net/500x500/924656TD/chinelo-havaianas-hype-fc-masculino-img.jpg', 'Chinelo', 60.00, 0, 20, '2020-05-17 12:09:41');
INSERT INTO "public"."product_info" VALUES ('C0002', 2, '2020-05-17 12:11:51', 'Bermuda esporte', 'https://imgcentauro-a.akamaihd.net/500x500/936299OX/bermuda-oxer-recortes-feminina-img.jpg', 'Bermuda feminina', 13.00, 0, 108, '2020-05-17 12:11:51');
INSERT INTO "public"."product_info" VALUES ('C0003', 2, '2020-05-17 12:12:46', 'Tenis Bom', 'https://imgcentauro-a.akamaihd.net/500x500/932534X7/tenis-nike-air-max-oketo-masculino-img.jpg', 'Tenis', 199.99, 1, 0, '2018-03-10 12:12:46');
INSERT INTO "public"."product_info" VALUES ('C0004', 2, '2020-05-17 12:12:46', 'Relogio top', 'https://imgcentauro-a.akamaihd.net/500x500/94252002/monitor-cardiaco-relogio-inteligente-oxer-oxwatch-wearfit-img.jpg', 'Relogio', 32.00, 0, 322, '2020-05-17 12:12:46');
INSERT INTO "public"."product_info" VALUES ('C0005', 2, '2020-05-17 12:11:51', 'Blusa moda', 'https://imgcentauro-a.akamaihd.net/500x500/M03PC002/blusa-the-north-face-tka-100-glacier-zip-adulto-img.jpg', 'Blusa', 16.00, 0, 108, '2020-05-17 12:11:51');


-- ----------------------------
-- Dados e Informacoes dos Usuarios
-- ----------------------------
INSERT INTO "public"."users" VALUES (2147483641, 't', 'rua brasil 222', 'customer1@email.com', 'customer1', '$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu', '123456789', 'ROLE_CUSTOMER');
INSERT INTO "public"."users" VALUES (2147483642, 't', 'rua alfredo 33', 'manager1@email.com', 'manager1', '$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu', '987654321', 'ROLE_MANAGER');
INSERT INTO "public"."users" VALUES (2147483643, 't', 'rua marte 55', 'employee1@email.com', 'employee1', '$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu', '123123122', 'ROLE_EMPLOYEE');
INSERT INTO "public"."users" VALUES (2147483645, 't', 'rua lua 49', 'customer2@email.com', 'customer2', '$2a$10$0oho5eUbDqKrLH026A2YXuCGnpq07xJpuG/Qu.PYb1VCvi2VMXWNi', '2343456', 'ROLE_CUSTOMER');

-- ----------------------------
-- Dados e Informacoes de Carrinhos
-- ----------------------------
INSERT INTO "public"."cart" VALUES (2147483641);




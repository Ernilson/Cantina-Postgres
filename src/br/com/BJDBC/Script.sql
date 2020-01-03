create database sibre;

CREATE TABLE clientes (
  id_c serial,
  nome varchar(200) NOT NULL,
  ender varchar(200) NOT NULL,
  fone varchar(200) NOT NULL,    
  estatus varchar(200) NOT NULL,
   primary key (id_c)
);

create table acesso(
id_Ac serial primary key,
login varchar(60) not null,
senha varchar(60) not null,
perfil varchar(60) null,
clientes int,
foreign key(clientes) references clientes(id_c) 
);

create table venda(
id_v serial,
codvenda int not null,
nome character varying(100) COLLATE pg_catalog."default",
descricao character varying(100) COLLATE pg_catalog."default",
qtdp int,
valor_item decimal(10,2),
valor_sub_total decimal(10,2),
valor_total decimal(10,2), -- Valor Total
forma_pg varchar(20),
clientes int,
dataq timestamp default current_timestamp,
primary key (id_v)    
);

create table carrinho(
id_cr serial,
codvenda int not null,
nome character varying(100) COLLATE pg_catalog."default",
descricao character varying(150) COLLATE pg_catalog."default",
qtdp int,
valor_item decimal(10,2),
valor_sub_total decimal(10,2),
valor_total decimal(10,2), -- Valor Total
forma_pg character varying(20) COLLATE pg_catalog."default",
dataq timestamp default current_timestamp,
    primary key (id_cr)
);

create table teste(
id_t serial,
    forma_pg varchar(80),
    venda int,
    carrinho int,
    primary key (id_t)
);

create table estorno(
id_st serial,
codVenda varchar(80),
Caixa varchar(200) not null,
cliente varchar(200) not null,
descricao varchar(200) null,
qtde int,
valor_item varchar(80),
valor_total varchar(80),
forma_pg varchar(80),
dataq timestamp default current_timestamp,
    primary key (id_st)
);

create table produtos(
id_pro serial,
CodProduto int not null,
descricao_p varchar(200),
estoque integer,
repositor integer,
preco decimal(10,2)not null,  -- por unidade (valor item)
dataq timestamp default current_timestamp,
    primary key (id_pro)
);


insert into acesso(login, senha, perfil) values ('admin','admin','Adminstrador');

--------------------------------------------------------------------------------------------------------------
---------------------------METODO PRCEDURE PARA SETAR A FORMA DE PAGAMENTO DA TABELA 'TESTE'------------------------
--------------------------------------------------------------------------------------------------------------

CREATE OR REPLACE FUNCTION public.alinha_teste(
	forma_pg character varying)
    RETURNS void
    LANGUAGE 'plpgsql'
   
AS $BODY$

BEGIN
IF(forma_pg = forma_pg) THEN
update teste set codcomp = 100;
END IF;
END;

$BODY$;

ALTER FUNCTION public.alinha_teste(character varying)
    OWNER TO postgres;


----------------------------------------------------------------------------------------------------------------------------------
-------------------------METODO PRCEDURE PARA SETAR A FORMA DE PAGAMENTO DA TABELA 'TESTE' NA TABELA "CARRINHO"------------------------
-------------------------------------------------------------------------------------------------------------------------------------

CREATE OR REPLACE FUNCTION public.alinha_carrinho(
	valor character varying)
    RETURNS void
    LANGUAGE 'plpgsql'
    
AS $BODY$

BEGIN
update carrinho set forma_pg = (
select (select forma_pg from teste where forma_pg =  valor));
END;

$BODY$;

ALTER FUNCTION public.alinha_carrinho(character varying)
    OWNER TO postgres;

-------------------------------------METODO PARA BAIXA DA COLUNA ESTOQUE DA TABELA PRODUTOS ------------------------------------------------------------------
CREATE OR REPLACE FUNCTION public.baixa_estoque(
	cod integer,
	quantidade integer)
    RETURNS void
    LANGUAGE 'plpgsql'
   
AS $BODY$

BEGIN
update produtos set repositor = quantidade where codproduto = Cod;
update produtos set estoque = (select (select   sum(estoque - repositor) as Diferenca from produtos where codProduto = Cod));
END;

$BODY$;

-------------------------------------METODO PARA ESTORNO DA VENDA ------------------------------------------------------------------

update produtos set repositor = (select (select estoque where codProduto = 100) + (select qtdp from venda where id_v = 101));
update produtos set estoque = (select cast(repositor as integer) from produtos where codproduto = 100);
select * from produtos;


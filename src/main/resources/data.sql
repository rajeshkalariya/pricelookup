INSERT INTO product (id, product, product_name) VALUES
  (1, '10000000011', 'Product11'),
  (2, '10000000012', 'Product12'),
  (3, '10000000013', 'Product13'),
  (4, '10000000021', 'Product21'),
  (5, '10000000022', 'Product22'),
  (6, '10000000023', 'Product23');  

INSERT INTO price (price, product_id,price_type, effective_start_date,
effective_end_date,production_date,obsolte_date) VALUES
(100.101, 1, 'AMP-Monthly',
parsedatetime('01-01-2012 00:00:00.00', 'dd-MM-yyyy hh:mm:ss.SS'), 
parsedatetime('31-01-2012 00:00:00.00', 'dd-MM-yyyy hh:mm:ss.SS'),
parsedatetime('01-02-2012 01:47:52.00', 'dd-MM-yyyy hh:mm:ss.SS'),
parsedatetime('10-02-2012 18:47:52.00', 'dd-MM-yyyy hh:mm:ss.SS')
);


INSERT INTO price (price, product_id,price_type, effective_start_date,
effective_end_date,production_date,obsolte_date) VALUES
(10.201, 1, 'AMP-Monthly',
parsedatetime('01-01-2012 00:00:00.00', 'dd-MM-yyyy hh:mm:ss.SS'), 
parsedatetime('31-01-2012 00:00:00.00', 'dd-MM-yyyy hh:mm:ss.SS'),
parsedatetime('10-02-2012 18:47:53.00', 'dd-MM-yyyy hh:mm:ss.SS'),
parsedatetime('20-02-2012 10:35:50.00', 'dd-MM-yyyy hh:mm:ss.SS')
);

INSERT INTO price (price, product_id,price_type, effective_start_date,
effective_end_date,production_date,obsolte_date) VALUES
(10.301, 1, 'AMP-Monthly',
parsedatetime('01-01-2012 00:00:00.00', 'dd-MM-yyyy hh:mm:ss.SS'), 
parsedatetime('31-01-2012 00:00:00.00', 'dd-MM-yyyy hh:mm:ss.SS'),
parsedatetime('20-02-2012 10:35:51.00', 'dd-MM-yyyy hh:mm:ss.SS'),
parsedatetime('31-12-2099 10:35:50.00', 'dd-MM-yyyy hh:mm:ss.SS')
);

INSERT INTO price (price, product_id,price_type, effective_start_date,
effective_end_date,production_date,obsolte_date) VALUES
(77.177, 2, 'AMP-Monthly',
parsedatetime('01-01-2012 00:00:00.00', 'dd-MM-yyyy hh:mm:ss.SS'), 
parsedatetime('31-01-2012 00:00:00.00', 'dd-MM-yyyy hh:mm:ss.SS'),
parsedatetime('17-09-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'),
parsedatetime('17-09-2014 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS')
);
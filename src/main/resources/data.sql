INSERT INTO product (id, product, product_name) VALUES
  (1, '10000000011', 'Product11'),
  (2, '10000000012', 'Product12'),
  (3, '10000000013', 'Product13'),
  (4, '10000000021', 'Product21'),
  (5, '10000000022', 'Product22'),
  (6, '10000000023', 'Product23');  

INSERT INTO price (id, price, product_id,price_type, effective_start_date,
effective_end_date,production_date,obsolte_date) VALUES
(1, 100.1234, 1, 'AMP-Monthly',
parsedatetime('17-09-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 
parsedatetime('17-09-2014 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'),
parsedatetime('17-09-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'),
parsedatetime('17-09-2014 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS')
);


INSERT INTO price (id, price, product_id,price_type, effective_start_date,
effective_end_date,production_date,obsolte_date) VALUES
(2, 10.112, 1, 'AMP-Monthly',
parsedatetime('17-09-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 
parsedatetime('17-09-2014 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'),
parsedatetime('17-09-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'),
parsedatetime('17-09-2014 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS')
);

INSERT INTO price (id, price, product_id,price_type, effective_start_date,
effective_end_date,production_date,obsolte_date) VALUES
(3, 77.177, 2, 'AMP-Monthly',
parsedatetime('17-11-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 
parsedatetime('17-12-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'),
parsedatetime('17-09-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'),
parsedatetime('17-09-2014 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS')
);
CREATE TABLE `entra21`.`vacinas` (
  `pais_origem` VARCHAR(300) NOT NULL,
  `estagio_pesquisa` INT NOT NULL,
  `data_inicio_pesquisa` DATE NOT NULL,
  `nome_responsavel` VARCHAR(300) NOT NULL);

ALTER TABLE `entra21`.`vacinas` 
ADD COLUMN `id` INT NOT NULL AUTO_INCREMENT AFTER `nome_responsavel`,
ADD PRIMARY KEY (`id`);
;

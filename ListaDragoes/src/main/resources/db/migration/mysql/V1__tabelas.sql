CREATE TABLE `dragao` (
`id` bigint(20) NOT NULL,
`name` varchar(255) NOT NULL,
`type` varchar(255) NOT NULL,
`data_criacao` datetime NOT NULL
)
ALTER TABLE `dragao`
ADD PRIMARY KEY (`id`);
ALTER TABLE `dragao`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
INSERT INTO `dragao` (`id`, `name`, `type`, `data_criacao`)
VALUES (NULL, 'akira', wyvern, CURRENT_DATE());

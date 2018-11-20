-- -----------------------------------------------------
-- Table `card_info`.`idempotent_control`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `idempotent_control` (
  `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `instruction_id` BIGINT(20) UNSIGNED NOT NULL,
  `pay_channel` INT UNSIGNED NOT NULL,
  `mifi_id` BIGINT(20) UNSIGNED NOT NULL,
  `amount` BIGINT(20) UNSIGNED NOT NULL,
  `trade_code` TINYINT(4) UNSIGNED NOT NULL,
  `status` INT UNSIGNED NOT NULL,
  `create_time` BIGINT(20) UNSIGNED NOT NULL DEFAULT 0,
  `update_time` BIGINT(20) UNSIGNED NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `uk_instruction_id` (`instruction_id`)
)
;

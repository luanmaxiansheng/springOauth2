SELECT `oauth_client_details`.`client_secret`,
    `oauth_client_details`.`resource_ids`,
    `oauth_client_details`.`scope`,
    `oauth_client_details`.`authorized_grant_types`,
    `oauth_client_details`.`web_server_redirect_uri`,
    `oauth_client_details`.`authorities`,
    `oauth_client_details`.`access_token_validity`,
    `oauth_client_details`.`refresh_token_validity`,
    `oauth_client_details`.`additional_information`,
    `oauth_client_details`.`autoapprove`,
    `oauth_client_details`.`client_id`
FROM `SecurityOauth2`.`oauth_client_details`;

创建的sql 自己写吧 哈哈哈 我是一个不负责任的程序员 主要是忘了粘贴出来了

access_token_validity 字段类型 为 INT
refresh_token_validity 字段类型 为 INT
autoapprove 字段类型 为 TINYINT(1) 默认我给的是0
其他字段 VARCHAR(45) 或者 VARCHAR(100)



SELECT `user`.`username`,
    `user`.`secret`,
    `user`.`authority`
FROM `SecurityOauth2`.`user`;
都是 VARCHAR 长度自定义

我用的是mysql 哈
//package com.example.demo.config;
//
//import org.springframework.context.annotation.Primary;
//import org.springframework.security.oauth2.provider.ClientDetails;
//import org.springframework.security.oauth2.provider.ClientDetailsService;
//import org.springframework.security.oauth2.provider.ClientRegistrationException;
//import org.springframework.security.oauth2.provider.client.BaseClientDetails;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;
//@Primary
//@Component("clientDetailServiceImpl")
//public class ClientDetailServiceImpl implements ClientDetailsService {
//    @Override
//    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
//        Set<String> uri_set = new HashSet<String>();
//        uri_set.add("http://www.baidu.com");
//        ClientDetails clientDetails = new BaseClientDetails();
//        if(!(clientId.equals("xiong"))){
//            throw new ClientRegistrationException("客户端身份不对");
//        }
//        ((BaseClientDetails) clientDetails).setClientId("xiong");
//        ((BaseClientDetails) clientDetails).setClientSecret("$2a$10$2da4L5Gt7dsJXzWwxlggUO6VPnLYVXBl6qITwTdjLmSoaQo5aeEYW");
//        ((BaseClientDetails) clientDetails).setRegisteredRedirectUri(uri_set);
//        ((BaseClientDetails) clientDetails).setScope(Arrays.asList("scope"));
//        ((BaseClientDetails) clientDetails).setAuthorizedGrantTypes(Arrays.asList("authorization_code","refresh_token"));
//        return clientDetails;
//    }
//}

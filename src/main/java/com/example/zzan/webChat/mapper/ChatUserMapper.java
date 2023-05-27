package com.example.zzan.webChat.mapper;

import com.example.zzan.webChat.Entity.ChatUser;
import com.example.zzan.webChat.dto.ChatUserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface ChatUserMapper {
    ChatUserMapper INSTANCE = Mappers.getMapper(ChatUserMapper.class);

    ChatUserDto toDto(ChatUser e);
    ChatUser toEntity(ChatUserDto d);
}

import { Body, Controller, Get, Post } from '@nestjs/common';
import type { CreateUserDTO } from './dtos/createUser.dtos';

@Controller('user')
export class UserController {

    @Get() async getAllUsers(){
        return JSON.stringify(
            {test :'123456'}
        )
    }

    @Post() async createUser(@Body() createUser: CreateUserDTO) {
        return {
            ...createUser,
            password:undefined
        }
    }

}

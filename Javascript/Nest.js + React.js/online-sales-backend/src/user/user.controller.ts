import { Body, Controller, Get, Post } from '@nestjs/common';
import type { CreateUserDTO } from './dtos/createUser.dtos';
import { UserService } from './user.service';

@Controller('user')
export class UserController {

    @Get() async getAllUsers(){
        return JSON.stringify(
            {test :'123456'}
        )
    }

    constructor(private readonly userService: UserService){}
    @Post() async createUser(@Body() createUser: CreateUserDTO) {
        return this.userService.createUser(createUser)
    }

}

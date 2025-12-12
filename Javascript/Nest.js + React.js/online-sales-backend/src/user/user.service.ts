import { Injectable } from '@nestjs/common';
import { CreateUserDTO } from './dtos/createUser.dtos';
import { User } from './interfaces/user.interface';
import { promises } from 'dns';

@Injectable()
export class UserService {

    private users: User[] = []

    async createUser(createUserDTO: CreateUserDTO):Promise<User> {
        return ({
            ...createUserDTO,
            id : 1,
        })
    }
}

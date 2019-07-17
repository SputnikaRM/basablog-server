export class Post {
    id: number;
    title: string;
    postText : string;
    imageURL : string;
    userId : number;

    constructor(title: string, postText: string, userId: number) {
        this.title = title;
        this.postText = postText;
        this.userId = userId;
    }
}

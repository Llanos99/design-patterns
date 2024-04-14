public class Main {
    public static void main(String[] args) {
        Post post = PostFactory.createPost("BLOG");
        System.out.println(post.getClass());
    }
}
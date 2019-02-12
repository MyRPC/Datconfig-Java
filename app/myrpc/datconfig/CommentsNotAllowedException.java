package app.myrpc.datconfig;

public class CommentsNotAllowedException extends Exception {
	public CommentsNotAllowedException(int position) {
		super("Found comment in datconfig at position " + position + ". Either configure your parser to allow comments, or don't use them :)");
	}
}
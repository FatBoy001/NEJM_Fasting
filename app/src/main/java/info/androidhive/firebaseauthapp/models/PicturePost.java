package info.androidhive.firebaseauthapp.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class PicturePost  {

    private String PostID;
    private long postTime;
    private String user_avatar;
    private String user_name;
    private String user_ID;
    private String description;
    private int post_type;
    private ArrayList<PicturePostGridImage >Images;
    private ArrayList<Comments >comments;
    private ArrayList<Likes >likes;

    public PicturePost() {
    }

    public String getPostID() {
        return PostID;
    }

    public void setPostID(String postID) {
        PostID = postID;
    }

    public ArrayList<Likes> getLikes() {
        return likes;
    }

    public void setLikes(ArrayList<Likes> likes) {
        this.likes = likes;
    }

    public String getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(String user_ID) {
        this.user_ID = user_ID;
    }

    public ArrayList<Comments> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comments> comments) {
        this.comments = comments;
    }

    public long getPostTime() {
        return postTime;
    }

    public void setPostTime(long postTime) {
        this.postTime = postTime;
    }

    public int getPost_type() {
        return post_type;
    }

    public void setPost_type(int post_type) {
        this.post_type = post_type;
    }




    public ArrayList<PicturePostGridImage> getImages() {
        return Images;
    }

    public String getUser_avatar() {
        return user_avatar;
    }

    public void setUser_avatar(String user_avatar) {
        this.user_avatar = user_avatar;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImages(ArrayList<PicturePostGridImage> images) {
        Images = images;
    }

//    @SuppressWarnings({ "rawtypes", "unchecked" })
//    protected PicturePost(Parcel in) {
//        ItemID = in.readInt();
//        ItemName = in.readString();
//        Images = (ArrayList) in.readValue(ArrayList.class.getClassLoader());
//
//    }
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeInt(ItemID);
//        dest.writeString(ItemName);
//        dest.writeValue(Images);
//
//    }
//
//    public static final Parcelable.Creator<PicturePost> CREATOR = new Parcelable.Creator<PicturePost>() {
//        @Override
//        public PicturePost createFromParcel(Parcel in) {
//            return new PicturePost(in);
//        }
//
//        @Override
//        public PicturePost[] newArray(int size) {
//            return new PicturePost[size];
//        }
//    };
//
//    @Override
//    public String toString() {
//        return "ItemList{" +
//                "IID=" + ItemID +
//                ", ItemName='" + ItemName + '\'' +
//                ", Images=" + Images +
//                '}';
//    }
}
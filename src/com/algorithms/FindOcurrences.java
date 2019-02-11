package com.algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class FindOcurrences {
    static int getTopicCount(String topic) {
        int topicCount = 0;
        if(topic == null) {
            return topicCount;
        }
        String url = "https://en.wikipedia.org/w/api.php?action=parse&section=0&prop=text&format=json&page=" + topic;
        URL obj = null;
        HttpURLConnection con = null;
        try {
            obj = new URL(url);
            con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            topicCount = findOccurrences(response.toString(), topic);
        } catch (MalformedURLException e) {
            System.out.print(e.getMessage());
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return topicCount;
    }

    static int findOccurrences(String content, String word) {
        int lastIndex = 0;
        int count = 0;

        while(lastIndex != -1){

            lastIndex = content.indexOf(word,lastIndex);

            if(lastIndex != -1){
                count ++;
                lastIndex += word.length();
            }
        }
        return count;
    }
    public static void main(String args[]) {
        System.out.print(getTopicCount("pizza"));
    }

    class Node {
        Node left, right;
        int data;
        Node(int newData) {
                left = right = null;
                data = newData;
        }
    }
    static byte values[] = new byte[50000];

    private static int isPresent(Node root, int val) {
        if(values[val] == 1) {
            return 1;
        } else if(values[val] == -1) {
            return 0;
        } else {
            Node node = findNode(root, val);
            if(node == null) {
                values[val] = -1;
                return 0;
            } else{
                values[val] = 1;
                return 1;
            }
        }
    }

    private static Node findNode(Node root, int val) {

        if(root == null || root.data == val) {
            return root;
        }

        if (root.data > val)
            return findNode(root.left, val);

        return findNode(root.right, val);
    }
}

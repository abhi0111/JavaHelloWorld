/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class TreeNode
{
    
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data)
    {
        this.data=data;
        left=null;
        right=null;
        
        
    }
    
}

class Codechef
{
    
    public static void Inorder(TreeNode root)
    {
        if(root==null)
        return ;
        
        Inorder(root.left);
        System.out.println(root.data);
        Inorder(root.right);
        
        
    }
    
    public static void InorderIter(TreeNode root)
    {
        Stack <TreeNode> s=new Stack<>();
        
        while(true)
        {
            while(root!=null)
            {
                s.push(root);
                
                
                root=root.left;
                
                
            }
            
            if(s.isEmpty())
            return ;
            root=s.pop();
            System.out.println(root.data);
            root=root.right;
        }
    }
    
    
    public static void preorderIter(TreeNode root)
    {
        Stack <TreeNode> s=new Stack<>();
        
        while(true)
        {
            while(root!=null)
            {
                s.push(root);
                
                System.out.println(root.data);
                root=root.left;
            }
            
            if(s.isEmpty())
            break;
            
            root=s.pop();
            root=root.right;
        }
    }
    
    public static int FindMax(TreeNode root)
    {
        if(root==null)
        return 0;
        
        int root_val=root.data;
        int max=-10000;
        int l=FindMax(root.left);
        int r=FindMax(root.right);
        
        
        if(l>r)
        max=l;
        else
        max=r;
        
        
        if(root_val>max)
        max=root_val;


        return max;
        
    }
    
    public static int FindMaxIter(TreeNode root)
    {
        Queue <TreeNode> q=new LinkedList<TreeNode>();
        int max=-10000;
        
        q.add(root);
        
        while(!q.isEmpty())
        {
            TreeNode parent=q.remove();
              
              if(parent.data>max)
              max=parent.data;
              
              if(parent.left!=null)
              q.add(parent.left);
              
              if(parent.right!=null)
              q.add(parent.right);
            
            }
        
        return max;
    }
    
    public static boolean SearchIter(TreeNode root,int data)
    {
        if(root==null)
        return false;
    
    boolean temp=false;   
        if(root.data==data)
        {
            temp=true;
             
            return temp;
            
        }
         
         temp=SearchIter(root.left,data);
        
        if(temp!=false)
        return temp;
        else
        return SearchIter(root.right,data);
        }
        
        public static void InsertBinaryTree(TreeNode root,int data)
        {
            Queue <TreeNode> q=new LinkedList<TreeNode>();
            
            TreeNode newNode=new TreeNode(data);
            
            if(root==null)
            {
                
                root=newNode;
                return ;
            }
            
            q.add(root);
            
            while(q.isEmpty())
            {
                TreeNode parent=q.remove();
                
                
                
                if(parent.left!=null)
                {
                    q.add(parent.left);
                    
                    
                }
                else
                {
                    parent.left=newNode;
                    return;
                    
                    
                }
                
                if(parent.right!=null)
                {
                    q.add(parent.right);
                    
                    }
                    else
                    {
                        parent.right=newNode;
                        return;
                        
                        
                    }
            }
            
        }
        
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		TreeNode node=new TreeNode(1);
		node.left=new TreeNode(2);
		node.right=new TreeNode(3);
		node.left.left=new TreeNode(4);
			node.left.right=new TreeNode(5);
			
				node.right.left=new TreeNode(6);
					node.right.right=new TreeNode(7);
		//InorderIter(node);
		//preorderIter(node);
	    //System.out.println(FindMaxIter(node));
	    
	    //System.out.println(SearchIter(node,7));
	    
	    InsertBinaryTree(node,10);
	    
	    InorderIter(node);
	    
	    
	}
}

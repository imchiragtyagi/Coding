import java.util.Arrays ;
class Mergesort
{
	public static void main(String[] args) {
		int []  a={5,4,3,2,1};
		a = mergesort(a);
		System.out.println(Arrays.toString(a));

	}
	public static int[] mergesort(int []a){

		if(a.length == 1)
		{
			return a;
		}

		int mid=a.length / 2;

		int[] left = mergesort(Arrays.copyOfRange(a,0,mid));
		int[] right = mergesort(Arrays.copyOfRange(a,mid,a.length));

		 return merge(left,right);

	}
	private static int[]merge(int []first,int []second)
	{
		int []mix=new int[first.length + second.length];

		int i=0;
		int j=0;
		int k=0;

		while(i<first.length && j<second.length)
		{
			if(first[i]<second[j])
			{
				mix[k]=first[i];
				i++;

			}
			else
			{
				mix[k]=second[j];
				j++;
			}
			k++;
		}
		while(i<first.length)
		{
			mix[k]=first[i];
			i++;
			k++;
		}
		while(j<second.length)
		{
			mix[k]=second[j];
			j++;
			k++;
		}
		return mix;
}
}
/*
import java.util.*;
public class Main
    {
        public static void main(String[] args) {
            int []a={5,4,3,2,1};
            mergesort(a,0,a.length);
            System.out.println(Arrays.toString(a));

        }
        public static void mergesort(int []a,int s,int e)
        {
            if(e-s == 1)
            {
                return ;
            }
            int mid=s+(e-s)/2;
            mergesort(a,0,mid);
            mergesort(a,mid,e);
            merge(a,s,mid,e);

        }
        private static void merge(int []a,int s,int m,int e)
        {
            int []mix=new int[e-s];
            int i=s;
            int j=m;
            int k=0;
            while(i< m&&j<e)
            {
                if(a[i]<a[j])
                {
                    mix[k++]=a[i++];

                }
                else if(a[i]==a[j])
                {
                    mix[k++]=a[i++];
                    j++;
                }
                else
                {
                    mix[k++]=a[j++];
                }
            }
            while(i<m)
            {
                mix[k++]=a[i++];
            }
            while(j<e)
            {
                mix[k++]=a[j++];
            }
            for (int l=0;l<mix.length;l++)
                a[s+l]=mix[l];


        }
    }
    */
    
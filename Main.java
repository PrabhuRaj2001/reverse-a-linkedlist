void rev()
	{
		
		ArrayList a=new ArrayList<>();
		node temp=head;
		while(temp!=null)
		{
			a.add(temp.val);
			temp=temp.next;
			
		}
		//System.out.println(a);
		node temp1=head;
		int g=a.size()-1;
		while(temp1!=null)
		{
			
			temp1.val=(int)a.get(g);
			g--;
			temp1=temp1.next;
			
		}
	}
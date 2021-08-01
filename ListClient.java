


import java.util.LinkedList;
import java.util.List;

public class ListClient {

    @SuppressWarnings("rawtypes")
	private List list;

	@SuppressWarnings("rawtypes")
	public ListClient() {
		list = new LinkedList();
	}

	@SuppressWarnings("rawtypes")
	public List getList() {
		return list;
	}
        
        
    public static void main(String[] args) 
    {
       ListClient lce = new ListClient();
		@SuppressWarnings("rawtypes")
		List list = lce.getList();
		System.out.println(list);
	}
    }
    


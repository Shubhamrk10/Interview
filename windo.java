class WindowHandle
{
	public static void main(String[] args) 
	{
		String parent = driver.getWindowHandle();
		System.out.println("Parent: "+parent);

		driver.findElements(By.id("")).click();

		set <String> childWindow = driver.getWindowHandles();
		
		Iterator iter = new Iterator;

		while(iter.hasNext()){
			Iterator child = iter.next();
			if (!parent.equalIgnoreCase(child))
			{
				driver.switchTo().window(child);

			}
		}
	}
}

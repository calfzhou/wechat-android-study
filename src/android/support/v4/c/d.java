package android.support.v4.c;

public final class d
{
  private static final Object jdField_do = new Object();
  private int cQ;
  private boolean dp;
  private int[] dq;
  private Object[] dr;

  private void gc()
  {
    int i = this.cQ;
    int[] arrayOfInt = this.dq;
    Object[] arrayOfObject = this.dr;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      Object localObject = arrayOfObject[j];
      if (localObject != jdField_do)
      {
        if (j != k)
        {
          arrayOfInt[k] = arrayOfInt[j];
          arrayOfObject[k] = localObject;
        }
        k++;
      }
      j++;
    }
    this.dp = false;
    this.cQ = k;
  }

  public final void clear()
  {
    int i = this.cQ;
    Object[] arrayOfObject = this.dr;
    for (int j = 0; j < i; j++)
      arrayOfObject[j] = null;
    this.cQ = 0;
    this.dp = false;
  }

  public final int keyAt(int paramInt)
  {
    if (this.dp)
      gc();
    return this.dq[paramInt];
  }

  public final int size()
  {
    if (this.dp)
      gc();
    return this.cQ;
  }

  public final Object valueAt(int paramInt)
  {
    if (this.dp)
      gc();
    return this.dr[paramInt];
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.c.d
 * JD-Core Version:    0.6.2
 */
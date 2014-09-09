package com.qq.taf.jce.dynamic;

import java.util.Arrays;
import java.util.Comparator;

public class StructField extends JceField
{
  private static final Comparator tagComp = new StructField.1();
  private JceField[] data;

  StructField(JceField[] paramArrayOfJceField, int paramInt)
  {
    super(paramInt);
    this.data = paramArrayOfJceField;
  }

  public JceField[] get()
  {
    return this.data;
  }

  public JceField getFieldByTag(int paramInt)
  {
    int i = Arrays.binarySearch(this.data, JceField.createZero(paramInt), tagComp);
    if (i >= 0)
      return this.data[i];
    return null;
  }

  public boolean setByTag(int paramInt, JceField paramJceField)
  {
    int i = Arrays.binarySearch(this.data, JceField.createZero(paramInt), tagComp);
    if (i >= 0)
    {
      this.data[i] = paramJceField;
      return true;
    }
    int j = -1 + -i;
    JceField[] arrayOfJceField = new JceField[1 + this.data.length];
    int k = 0;
    if (k >= j)
      arrayOfJceField[j] = paramJceField;
    while (true)
    {
      if (j >= this.data.length)
      {
        return false;
        arrayOfJceField[k] = this.data[k];
        k++;
        break;
      }
      arrayOfJceField[(j + 1)] = this.data[j];
      j++;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.dynamic.StructField
 * JD-Core Version:    0.6.2
 */
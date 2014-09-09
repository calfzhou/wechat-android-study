package com.tencent.kingkong;

import java.util.Iterator;

public final class CursorJoiner
  implements Iterable, Iterator
{
  private int[] mColumnsLeft;
  private int[] mColumnsRight;
  private CursorJoiner.Result mCompareResult;
  private boolean mCompareResultIsValid;
  private Cursor mCursorLeft;
  private Cursor mCursorRight;
  private String[] mValues;

  static
  {
    if (!CursorJoiner.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }

  public CursorJoiner(Cursor paramCursor1, String[] paramArrayOfString1, Cursor paramCursor2, String[] paramArrayOfString2)
  {
    if (paramArrayOfString1.length != paramArrayOfString2.length)
      throw new IllegalArgumentException("you must have the same number of columns on the left and right, " + paramArrayOfString1.length + " != " + paramArrayOfString2.length);
    this.mCursorLeft = paramCursor1;
    this.mCursorRight = paramCursor2;
    this.mCursorLeft.moveToFirst();
    this.mCursorRight.moveToFirst();
    this.mCompareResultIsValid = false;
    this.mColumnsLeft = buildColumnIndiciesArray(paramCursor1, paramArrayOfString1);
    this.mColumnsRight = buildColumnIndiciesArray(paramCursor2, paramArrayOfString2);
    this.mValues = new String[2 * this.mColumnsLeft.length];
  }

  private int[] buildColumnIndiciesArray(Cursor paramCursor, String[] paramArrayOfString)
  {
    int[] arrayOfInt = new int[paramArrayOfString.length];
    for (int i = 0; ; i++)
    {
      if (i >= paramArrayOfString.length)
        return arrayOfInt;
      arrayOfInt[i] = paramCursor.getColumnIndexOrThrow(paramArrayOfString[i]);
    }
  }

  private static int compareStrings(String[] paramArrayOfString)
  {
    if (paramArrayOfString.length % 2 != 0)
      throw new IllegalArgumentException("you must specify an even number of values");
    for (int i = 0; ; i += 2)
    {
      if (i >= paramArrayOfString.length)
        return 0;
      if (paramArrayOfString[i] == null)
      {
        if (paramArrayOfString[(i + 1)] != null)
          return -1;
      }
      else
      {
        if (paramArrayOfString[(i + 1)] == null)
          return 1;
        int j = paramArrayOfString[i].compareTo(paramArrayOfString[(i + 1)]);
        if (j != 0)
        {
          if (j < 0)
            return -1;
          return 1;
        }
      }
    }
  }

  private void incrementCursors()
  {
    if (this.mCompareResultIsValid)
      switch ($SWITCH_TABLE$com$tencent$kingkong$CursorJoiner$Result()[this.mCompareResult.ordinal()])
      {
      default:
      case 2:
      case 1:
      case 3:
      }
    while (true)
    {
      this.mCompareResultIsValid = false;
      return;
      this.mCursorLeft.moveToNext();
      continue;
      this.mCursorRight.moveToNext();
      continue;
      this.mCursorLeft.moveToNext();
      this.mCursorRight.moveToNext();
    }
  }

  private static void populateValues(String[] paramArrayOfString, Cursor paramCursor, int[] paramArrayOfInt, int paramInt)
  {
    assert ((paramInt == 0) || (paramInt == 1));
    for (int i = 0; ; i++)
    {
      if (i >= paramArrayOfInt.length)
        return;
      paramArrayOfString[(paramInt + i * 2)] = paramCursor.getString(paramArrayOfInt[i]);
    }
  }

  public final boolean hasNext()
  {
    if (this.mCompareResultIsValid)
      switch ($SWITCH_TABLE$com$tencent$kingkong$CursorJoiner$Result()[this.mCompareResult.ordinal()])
      {
      default:
        throw new IllegalStateException("bad value for mCompareResult, " + this.mCompareResult);
      case 3:
        if ((!this.mCursorLeft.isLast()) || (!this.mCursorRight.isLast()))
          break;
      case 2:
      case 1:
      }
    while ((this.mCursorLeft.isAfterLast()) && (this.mCursorRight.isAfterLast()))
    {
      do
      {
        do
        {
          return false;
          return true;
        }
        while ((this.mCursorLeft.isLast()) && (this.mCursorRight.isAfterLast()));
        return true;
      }
      while ((this.mCursorLeft.isAfterLast()) && (this.mCursorRight.isLast()));
      return true;
    }
    return true;
  }

  public final Iterator iterator()
  {
    return this;
  }

  public final CursorJoiner.Result next()
  {
    if (!hasNext())
      throw new IllegalStateException("you must only call next() when hasNext() is true");
    incrementCursors();
    assert (hasNext());
    int i;
    int j;
    if (this.mCursorLeft.isAfterLast())
    {
      i = 0;
      if (!this.mCursorRight.isAfterLast())
        break label159;
      j = 0;
      label70: if ((i == 0) || (j == 0))
        break label194;
      populateValues(this.mValues, this.mCursorLeft, this.mColumnsLeft, 0);
      populateValues(this.mValues, this.mCursorRight, this.mColumnsRight, 1);
      switch (compareStrings(this.mValues))
      {
      default:
      case -1:
      case 0:
      case 1:
      }
    }
    while (true)
    {
      this.mCompareResultIsValid = true;
      return this.mCompareResult;
      i = 1;
      break;
      label159: j = 1;
      break label70;
      this.mCompareResult = CursorJoiner.Result.LEFT;
      continue;
      this.mCompareResult = CursorJoiner.Result.BOTH;
      continue;
      this.mCompareResult = CursorJoiner.Result.RIGHT;
      continue;
      label194: if (i != 0)
      {
        this.mCompareResult = CursorJoiner.Result.LEFT;
      }
      else
      {
        assert (j != 0);
        this.mCompareResult = CursorJoiner.Result.RIGHT;
      }
    }
  }

  public final void remove()
  {
    throw new UnsupportedOperationException("not implemented");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.CursorJoiner
 * JD-Core Version:    0.6.2
 */
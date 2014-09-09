package com.tencent.kingkong.database;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

final class SQLiteConnection$Operation
{
  private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
  public ArrayList mBindArgs;
  public int mCookie;
  public long mEndTime;
  public Exception mException;
  public boolean mFinished;
  public String mKind;
  public String mSql;
  public long mStartTime;
  public int type;

  private String getFormattedStartTime()
  {
    return sDateFormat.format(new Date(this.mStartTime));
  }

  private String getStatus()
  {
    if (!this.mFinished)
      return "running";
    if (this.mException != null)
      return "failed";
    return "succeeded";
  }

  public final void bindStamentType(int paramInt)
  {
    this.type = paramInt;
  }

  public final void describe(StringBuilder paramStringBuilder, boolean paramBoolean)
  {
    paramStringBuilder.append(this.mKind);
    if (this.mFinished)
      paramStringBuilder.append(" took ").append(this.mEndTime - this.mStartTime).append("ms");
    int j;
    while (true)
    {
      paramStringBuilder.append(" - ").append(getStatus());
      if (this.mSql != null)
        paramStringBuilder.append(", sql=\"").append(SQLiteConnection.access$1(this.mSql)).append("\"");
      if ((paramBoolean) && (this.mBindArgs != null) && (this.mBindArgs.size() != 0))
      {
        paramStringBuilder.append(", bindArgs=[");
        int i = this.mBindArgs.size();
        j = 0;
        if (j < i)
          break;
        paramStringBuilder.append("]");
      }
      if ((this.mException != null) && (this.mException.getMessage() != null))
        paramStringBuilder.append(", exception=\"").append(this.mException.getMessage()).append("\"");
      return;
      paramStringBuilder.append(" started ").append(System.currentTimeMillis() - this.mStartTime).append("ms ago");
    }
    Object localObject = this.mBindArgs.get(j);
    if (j != 0)
      paramStringBuilder.append(", ");
    if (localObject == null)
      paramStringBuilder.append("null");
    while (true)
    {
      j++;
      break;
      if ((localObject instanceof byte[]))
        paramStringBuilder.append("<byte[]>");
      else if ((localObject instanceof String))
        paramStringBuilder.append("\"").append((String)localObject).append("\"");
      else
        paramStringBuilder.append(localObject);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteConnection.Operation
 * JD-Core Version:    0.6.2
 */
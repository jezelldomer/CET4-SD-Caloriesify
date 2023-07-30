package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new dev.jahidhasanco.bmicalculator.DataBinderMapperImpl());
  }
}

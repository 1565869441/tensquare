package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @创建者 Administrator
 * @创时间 2019/10/13 21:14
 * @描述 分页结果类
 * @版本 tensquare_parent
 * @更新者 entity
 * @更新时间 2019/10/13
 * @更新描述 TODO
 */
@Data
@NoArgsConstructor
public class PageResult<T> {
    private Long    total;
    private List<T> rows;
    public PageResult(Long total, List<T> rows) {
        super();
        this.total = total;
        this.rows = rows;
    }
}

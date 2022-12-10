grammar CSV;

@header {
package ag;
}

file
locals [int i = 0]
    : hdr ( rows += row[$hdr.text.split(",")] { $i++; })+
        {
            System.out.println($i + "rows");
            for (RowContext r : $rows) {
                System.out.println("row token interval : " + r.getSourceInterval());
            }
        }
    ;

hdr : ;

row : ;
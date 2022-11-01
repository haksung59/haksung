//
//  MemoStore.swift
//  PractiveUIMemo
//
//  Created by haksung on 2022/11/01.
//

import Foundation

class MemoStore: ObservableObject{
    @Published var list: [Memo]
    
    init() {
        list = [
            Memo(content: "lorem Ipsum 1"),
            Memo(content: "lorem Ipsum 2"),
            Memo(content: "lorem Ipsum 3")
        ]
    }
    
    func insert(memo: String){
        list.insert(Memo(content: memo), at: 0)
    }
    
    func update(memo: Memo?, content: String) {
        guard let memo = memo else { return }
        memo.content = content
    }
    
    func delete(memo: Memo){
        self.list.removeAll { $0 == memo }
    }
    
    func delete(set: IndexSet) {
        for index in set {
            self.list.remove(at: index)
        }
    }
}
